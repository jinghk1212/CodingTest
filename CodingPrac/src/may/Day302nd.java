package may;
/*
 * 181943
 문자열 my_string, overwrite_string과 정수 s가 주어집니다.
 문자열 my_string의 인덱스 s부터 overwrite_string의 길이만큼을
 문자열 overwrite_string으로 바꾼 문자열을 return 하는 solution 함수를 작성해 주세요. 
 */
public class Day302nd {
    public String solution(String my_string, String overwrite_string, int s) {
        StringBuilder result = new StringBuilder(my_string);
        
        for (int i = s ; i < s + overwrite_string.length() ; i++) {
        	if(i >= result.length()) {
        		result.append(overwrite_string.charAt(i - s));
        	} else {
        		result.setCharAt(i, overwrite_string.charAt(i - s));
        	}
        }
        return result.toString();
    }
    /*
     String before = my_string.substring(0, s);
     String after = my_string.substring(s + overwrite_string.length());
     return before + overwrite_string _ after
     */
    
    // substring(n): n번 째 원소부터 출력
    
    /*
     Class 클래스 : 객체를 만들어 내기 위한 설계도 혹은 틀, 연관되어 있는 변수와 멤서드의 집합
     Object 객체 : 소프트웨어에 구현할 대상, 클래스 선언된 모양 그대로 생성된 실체 (class의 instance)
     Instance : 객체를 소프트웨어에 실체화. 실체화된 인스턴스는 메모리에 할당.
     
     class vs object : 클래스는 설계도, 객체는 설계도로 구현한 모든 대상
     object vs instance : 클래스의 타입으로 선언되었을 때는 객체, 메모리에 할당이 되면 인스턴스
     => 메모리 할당? new 사용 ex) Scanner sc = new Scanner;
     */
}
