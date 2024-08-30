package _4Lesson;

public class FrogRiverOne {
    public static void main(String[] args) {
        int[] A = {1, 3, 5, 1, 5, 2, 3, 4, 5, 6};
        int X = 5;

        System.out.println(frogRiver(A, X));


    }

    public static int frogRiver(int[] A, int X) {
        boolean[] leaves = new boolean[X + 1];

        int last = 0;
        leaves[0] = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i] < leaves.length && !leaves[A[i]]) {
                leaves[A[i]] = true;
                last = i;
            }
        }

        for (int i = 0; i < leaves.length; i++) {
            if (!leaves[i]) last = -1;
        }
        return last;
    }
}
