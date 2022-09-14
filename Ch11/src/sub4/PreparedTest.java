package sub4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/*
 * 날짜 : 2022/09/14
 * 이름 : 공민혁
 * 내용 : JDBC PreparedStatement 실습하기
 * 
 * PreparedStatement
 * - Statement 클래스의 기능향상
 * - SQL문장이 미리 컴파일됨, 실행 시간동안 인수값을 위한 공간 확보
 * - 가독성이 좋은 형태로 넣을수 있음
 * - 재사용이 용이함
 * 
 * Statement
 * - 정적인 쿼리문을 처리할수 있음 (쿼리문에 값이 미리 입력되어 있어야함)
 * 
 *  차이점
 * - 캐시(Cache) 사용여부
 * - Statement를 사용하면 매번 쿼리를 수행할때마다 단계를 거쳐야 되지만
 *   PreparedStatement는 처음 한번만 단계를 거친후 캐시에 담아 재사용
 */

public class PreparedTest {
	public static void main(String[] args) {
		
		String host = "jdbc:mysql://127.0.0.1:3306/java1db";
		String user = "root";
		String pass = "1234";
	
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			//3단계
			String sql = "INSERT INTO `User2` VALUES (?,?,?,?);";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "a201");
			psmt.setString(2, "홍길동");
			psmt.setString(3, "010-1111-1234");
			psmt.setInt(4, 27);
			//4단계
			psmt.executeUpdate();
			//5단계

			//6단계
			psmt.close();
			conn.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Select 완료...");
		
	}
}
