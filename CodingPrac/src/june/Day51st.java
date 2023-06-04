package june;

/*
 * 181837
 팀의 막내인 철수는 아메리카노와 카페 라테만 판매하는 카페에서 팀원들의 커피를 사려고 합니다. 아메리카노와 카페 라테의 가격은 차가운 것과 뜨거운 것 상관없이 각각 4500, 5000원입니다. 각 팀원에게 마실 메뉴를 적어달라고 하였고, 그 중에서 메뉴만 적은 팀원의 것은 차가운 것으로 통일하고 "아무거나"를 적은 팀원의 것은 차가운 아메리카노로 통일하기로 하였습니다.

각 직원이 적은 메뉴가 문자열 배열 order로 주어질 때, 카페에서 결제하게 될 금액을 return 하는 solution 함수를 작성해주세요. order의 원소는 아래의 것들만 들어오고, 각각의 의미는 다음과 같습니다.
 */
public class Day51st {
	public int solution(String[] order) {
        int answer = 0;
        
        for(String menu : order) {
        	if (menu.equals("iceamericano") || menu.equals("americanoice") || menu.equals("hotamericano") || menu.equals("americanohot") || menu.equals("americano") || menu.equals("anything")) {
        		answer += 4500;
        	} else {
        		answer += 5000;
        	}
        }
        
        return answer;
    }
	
	/*
	 if (menu.contains("americano") || menu.contains("anything")){
	 	answer += 4500;
	 } else {
	 	answer += 5000;
	 }
	 원소값.contains => String의 어떠한 내용을 가지고있을때
	 
	 for (int i = 0 ; i < order.length ; i ++ ) {
	 	if(order[i].contains ~~ 로도 사용가능.
	 }
	 */
}
