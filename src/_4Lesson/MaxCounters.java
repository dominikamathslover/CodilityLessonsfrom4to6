package _4Lesson;

import java.util.Arrays;

public class MaxCounters {
    public static void main(String[] args) {
        int[] A = {4, 4, 6, 1, 4, 4};
        int N = 4;

        // Less effective, problem with large tables -> compare with MaxCountersNew
        System.out.println(Arrays.toString(counters(A, N)));

    }

    public static int[] counters(int[] A, int N) {
        int[] B = new int[N];
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] <= N) {
                B[A[i] - 1] = B[A[i] - 1] + 1;
            } else {
                for (int k = 0; k < B.length; k++) {
                    if (B[k] > max)
                        max = B[k];
                }
                for (int k = 0; k < B.length; k++) {
                    B[k] = max;
                }
            }
        }


        return B;
    }
}
