package june;

/*
자연수 n이 매개변수로 주어집니다.
n을 x로 나눈 나머지가 1이 되도록 하는 가장 작은 자연수 x를 return 하도록 solution 함수를 완성해주세요.
답이 항상 존재함은 증명될 수 있습니다.
 */
public class Day121st {
	public int solution(int n) {
        int x = 2;
        while (n % x != 1) {
        	x++;
        }
        return x;
    }
	// return IntStream.range(2,n).filter(i -> n % i == 1).findFirst().orElse(0);
	// steam은 함수비용이 적은 곳에서는 성능이 별로 안좋기 떄문에 단순 반복문에서는 좋지않다.
	
	/*
	 while(true) {   ==> for로 대체 가능.
	 	if(n % x == 1) {
	 		answer = x;
	 		break;
	 		}
 		x ++;
	}
	return answer;
	 */
}
