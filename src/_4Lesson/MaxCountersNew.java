package _4Lesson;

import java.util.Arrays;

public class MaxCountersNew {

    public static void main(String[] args) {
        int[] A = {4, 4, 6, 1, 4, 4};
        int N = 5;

        System.out.println(Arrays.toString(counters(A, N)));

    }

    public static int[] counters(int[] A, int N) {
        int[] B = new int[N];
        int max = 0;
        int lastMax = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                B[A[i] - 1] = Math.max(B[A[i] - 1], lastMax);
                B[A[i] - 1] = B[A[i] - 1] + 1;
                max = Math.max(max, B[A[i] - 1]);
            } else if (A[i] == N + 1) {
                lastMax = max;
            }
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = Math.max(B[i], lastMax);
        }
        return B;
    }


}
