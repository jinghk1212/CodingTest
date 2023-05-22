package may;

import java.lang.reflect.Array;
import java.util.Scanner;

/*
 181949
 영어 알파벳으로 이루어진 문자열 str이 주어집니다.
 각 알파벳을 대문자는 소문자로 소문자는 대문자로 변환해서 출력하는 코드를 작성해 보세요.
 */

public class Day222nd {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String answer = null;
        
//        int i = 0;
//        for (i=0 ; i<a.length() ; i++) {
//        	if(Character.isUpperCase(a.charAt(i))) {
//        		a.charAt(i);
//        	}
//        }
        
//       String[] words = new String[a.length()];
       char[] words = new char[a.length()];
       for(int i=0; i<a.length() ; i++) {
    	   words[i] = a.charAt(i);
       }
       
//       for(int i=0; i<a.length() ;i++) {
//    	   System.out.println(words[i]);
//       }
       
       for (int i = 0 ; i < a.length() ; i++) {
    	   if(Character.isUpperCase(words[i])) {
    		   words[i] = Character.toLowerCase(words[i]);
    	   } else {
    		   words[i] = Character.toUpperCase(words[i]);
    	   }
       }
       for(int i = 0 ; i < a.length() ; i++) {
       System.out.print(words[i]);
       }
    }
}
