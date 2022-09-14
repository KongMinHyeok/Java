package sub4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

/*
 * 날짜 : 2022/09/14
 * 이름 : 공민혁
 * 내용 : 프로퍼티 실습하기
 * 
 * Properties
 * - Hashtables의 하위 클래스
 * - Hashtables를 상속 받았기 떄문에 Map의 속성 즉, key와 Value를 갖는다
 * - 파일 입출력을 지원
 */
public class PropertiesTest {

	public static void main(String[] args) {
		
		// 프로퍼티 생성
		Properties prop = new Properties();
		prop.setProperty("A", "Apple");
		prop.setProperty("B", "Banana");
		prop.setProperty("C", "Cherry");
		
		System.out.println(prop);
		
		String path = "C:\\Users\\Administrator\\Desktop\\Fruit.properties";
		
		// 프로퍼티 파일 생성
		try {
			FileOutputStream fos = new FileOutputStream(path);
			prop.store(fos, null); // 파일쓰기
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("프로퍼티 파일 생성완료...");
		
		//프로퍼티 객체 생성
		String target = "C:\\Users\\Administrator\\Desktop\\Cities.properties";
		Properties proCities = new Properties();
		
		try {
			FileInputStream fis = new FileInputStream(target);
			proCities.load(fis); // 파일읽기
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(proCities);
		System.out.println(proCities.getProperty("kor"));
		System.out.println(proCities.getProperty("usa"));
		System.out.println("프로퍼티 객체 생성완료....");
	}
	
}
