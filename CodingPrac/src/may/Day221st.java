package may;

import java.util.Scanner;

/*
181950
문자열 str과 정수 n이 주어집니다.
str이 n번 반복된 문자열을 만들어 출력하는 코드를 작성해 보세요.
 */

public class Day221st {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = sc.nextInt();
        String result = "";
        int i = 0;
        for (i=0 ; i<n ; i++) {
        	result += str;
        }
        
        System.out.println(result);
    }
}	
