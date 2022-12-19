package org.example.year2022Month12.day19;

/**
 * 정수제곱근 판별
 * @see <a href="https://school.programmers.co.kr/learn/courses/30/lessons/12934?language=java">...</a>
 * @since 2022/12/19
 */
public class Programmers12934 {
    public long solution(long number) {
        double sqrtNumber = Math.sqrt(number);

        if (sqrtNumber % 1 == 0) {
            return (long) ((sqrtNumber + 1) * (sqrtNumber + 1));
        } else {
            return -1L;
        }
    }
}
