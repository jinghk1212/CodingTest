package may;
/*
  181929
 정수가 담긴 리스트 num_list가 주어질 때, 
 모든 원소들의 곱이 모든 원소들의 합의 제곱보다 작으면 1을 크면 0을 return하도록 solution 함수를 완성해주세요.
 */
public class Day252nd {
    public int solution(int[] num_list) {
        int answer = 0;
        int sum = 0;
        int multi = 1;
        for(int i = 0 ; i < num_list.length ; i++) {
        	sum += num_list[i];
        }
        for(int i = 0 ; i < num_list.length ; i++) {
        	multi *= num_list[i];
        }
        if (sum * sum < multi) {
        	answer = 0;
        } else {
        	answer = 1;
        }
        return answer;
        
        // return (Arrays.stream(numList).reduce((acc, i) -> acc * i).getAsInt() < Math.pow(Arrays.stream(numList).sum(), 2)) ? 1 : 0;
    }
}
