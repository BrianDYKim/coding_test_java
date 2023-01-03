package org.example.year2023.jan.day3;

/**
 * 종만북 119 페이지 2번째 예제문제
 * @author Doyeop Kim
 * @version 0.0
 * @since 2023/01/03
 */
public class JM119Second {

    public static final int MIN = Integer.MIN_VALUE;

    public static int fastestSum(int[] intArray) {
        int length = intArray.length;
        int result = MIN;
        int partialSum = 0;

        // 항상 정답은 숫자 하나로 구성되어있거나, 혹은 숫자 하나로부터 일정 구간을 가짐을 이용한다
        for (int i = 0; i < length; i++) {
            partialSum = Integer.max(0, partialSum) + intArray[i];
            result = Integer.max(partialSum, result); // 항상 최댓값을 반영해준다
        }

        return result;
    }
}
