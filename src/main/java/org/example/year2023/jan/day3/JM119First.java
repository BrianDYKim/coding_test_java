package org.example.year2023.jan.day3;

/**
 * 종만북 119 페이지 최대 연속 부분 구간 합을 분할 정복 방법으로 푸는 예제
 *
 * @author Doyeop Kim
 * @version 0.0
 * @since 2023/01/03
 */
public class JM119First {

    public static final int MIN = Integer.MIN_VALUE; // 최솟값 정의

    public static int solution(int[] intArray, int low, int high) {
        // 기저 조건 : intArray의 길이가 1인 경우
        if (low == high) {
            return intArray[low];
        }

        int mid = (low + high) / 2;

        int sum = 0;
        int left = MIN;
        int right = MIN;

        // left 계산
        for (int i = mid; i >= low; --i) {
            sum += intArray[i];
            left = Integer.max(left, sum);
        }

        sum = 0;

        // right 계산
        for (int j = mid + 1; j <= high; j++) {
            sum += intArray[j];
            right = Integer.max(right, sum);
        }

        // 최대 구간이 두 조각 중에서 한 조각에만 존재하는 경우
        int single = Integer.max(
                solution(intArray, low, mid),
                solution(intArray, mid + 1, high)
        );

        return Integer.max(left + right, single);
    }
}
