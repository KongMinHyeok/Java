package sub1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.nio.charset.MalformedInputException;

/*
 * 날짜 : 2022/09/21
 * 이름 : 공민혁 
 * 내용 : HTTP 통신 실습하기
 * 
 */

public class HttpTest {
	public static void main(String[] args) {
		
		try {
			
			URL url = new URL("https://www.google.com");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
			
		} catch (MalformedInputException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
