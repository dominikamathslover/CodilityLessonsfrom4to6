package _6Lesson;

import java.util.Arrays;

public class MaxProductOfThree {
    public static void main(String[] args) {
        int[] A = {-10, -5, -6,-4,-2,-1};

        System.out.println(procuctOfThree(A));

    }

    public static int procuctOfThree(int[] A) {
        if (A.length == 3) {
            return A[0] * A[1] * A[2];
        }
        int productOfPositive = 0;
        int productOfNegNegPos = 0;
        Arrays.sort(A);

        if(allNegative(A)){
            return A[A.length - 1] *A[A.length - 2]* A[A.length - 3];
        }

        if (A[A.length - 1] > 0 && A[A.length - 2] > 0 && A[A.length - 3] > 0) {
            productOfPositive = A[A.length - 1] * A[A.length - 2] * A[A.length - 3];
        }
        if (A[0] < 0 && A[1] < 0 && A[A.length - 1] > 0) {
            productOfNegNegPos = A[0] * A[1] * A[A.length - 1];
        }

        return Math.max(productOfPositive, productOfNegNegPos);
    }

    public static boolean allNegative(int[] A) {
        boolean allNeg = true;
        for (int i : A) {
            if (i > 0) {
                return false;
            }
        }
        return allNeg;
    }
}
