package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 날씨 : 2022/09/14
 * 이름 : 공민혁
 * 내용 : JDBC Select 실습하기 
 * 
 * SELECT = DB에서 값을 받아옴
 */

public class SelectTest {

	public static void main(String[] args) {
		
	
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
	
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계 - 데이터베이스 접속
			Connection conn = DriverManager.getConnection(host, user, pass);
			//3단계 - SQL 실행객체 생성
			Statement stmt = conn.createStatement();
			//4단계 - SQL 실행
			String 	sql = "SELECT * FROM `User2`;";
			   		
			ResultSet rs = stmt.executeQuery(sql); // Query 리턴 = 반환됨 
			//5단계 - 결과 처리
			while(rs.next()) {
				
				System.out.println("------------------");
				System.out.printf("%s, %s, %s, %d\n", rs.getString(1),
													  rs.getString(2),
													  rs.getString(3),
													  rs.getInt(4));
			}
			
			//6단계 - 지원해제
			rs.close();
			stmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	System.out.println("Select 완료...");
	}
}
