package june;

import java.math.BigInteger;

/*
 * 181914
 음이 아닌 정수를 9로 나눈 나머지는 그 정수의 각 자리 숫자의 합을 9로 나눈 나머지와 같은 것이 알려져 있습니다.
이 사실을 이용하여 음이 아닌 정수가 문자열 number로 주어질 때, 이 정수를 9로 나눈 나머지를 return 하는 solution 함수를 작성해주세요.
 */
public class Day21st {
	public int solution(String number) {
        BigInteger bigInteger = new BigInteger(number);
        BigInteger result = bigInteger.mod(BigInteger.valueOf(9));
        return result.intValue();
    }
	// int값으로 나타낼 수 없을때 사용하는 import = import java.math.BigInteger
	// Integer.parseInt(값), .intValue(); 등 사용법 확인
}
