package Network;

import java.net.MalformedURLException;
import java.net.URL;

public class ParseURL {

	public static void main(String[] args) {
		URL opinion = null;
		URL homePage = null;

		// http://dgit.or.kr/SUB/?ctId=15
		try {
			homePage = new URL("http://dgit.or.kr");
			opinion = new URL(homePage, "SUB/?ctId=15");
			System.out.printf("protocal : %s\n", opinion.getProtocol());
			System.out.printf("Host : %s\n", opinion.getHost());
			System.out.printf("Port : %s\n", opinion.getPort());
			System.out.printf("Path : %s\n", opinion.getPath());
			System.out.printf("File : %s\n", opinion.getFile());			
		} catch (MalformedURLException e) {
			System.err.println("잘못된 URL 주소입니다.");
			e.printStackTrace();
		}
	}
}
