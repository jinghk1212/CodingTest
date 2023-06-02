package june;
/*
  문자열 binomial이 매개변수로 주어집니다.
  binomial은 "a op b" 형태의 이항식이고 a와 b는 음이 아닌 정수
  op는 '+', '-', '*' 중 하나입니다. 주어진 식을 계산한 정수를 return 하는 solution 함수를 작성해 주세요.
 */
public class Day22nd {
	public int solution(String binomial) {
        int answer = 0;
        if (binomial.contains("+")) {
            String[] arr = binomial.split(" \\+ ");
            answer = Integer.parseInt(arr[0]) + Integer.parseInt(arr[1]);
        } else if (binomial.contains("-")) {
            String[] arr = binomial.split(" - ");
            answer = Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]);
        } else if (binomial.contains("*")) {
            String[] arr = binomial.split(" \\* ");
            answer = Integer.parseInt(arr[0]) * Integer.parseInt(arr[1]);
        } else if (binomial.contains("/")) {
            String[] arr = binomial.split(" / ");
            double num1 = Double.parseDouble(arr[0]);
            double num2 = Double.parseDouble(arr[1]);
            answer = (int) (num1 / num2);
        } else {
            answer = 0;
        }
        return answer;
    }
	
	/*
	 왜 +와 *에만 \\가 붙는지? 확인 ==>
	 */
}
