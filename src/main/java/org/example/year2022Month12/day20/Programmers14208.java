package org.example.year2022Month12.day20;

import java.util.*;

/**
 * @author Doyeop Kim
 * @version 0.0
 * @since 2022/12/19
 */
public class Programmers14208 {

    public int solution(int n, int k, int[] enemies) {
        PriorityQueue<Integer> heapq = new PriorityQueue<>(Collections.reverseOrder());
        int currentRound = 0;

        if (k >= enemies.length) {
            return enemies.length;
        }

        while(isPossible(n, k, enemies[currentRound])) {
            heapq.add(enemies[currentRound]);
            n -= enemies[currentRound];

            if (n < 0) {
                k -= 1;
                int recoverSoldiers = heapq.poll();
                n += recoverSoldiers;
            }

            currentRound += 1;

            if (currentRound == enemies.length) {
                return enemies.length;
            }
        }

        return currentRound;
    }

    public boolean isPossible(int n, int k, int nextEnemy) {
        int nextN = n - nextEnemy;

        return nextN >= 0 || k > 0;
    }
}