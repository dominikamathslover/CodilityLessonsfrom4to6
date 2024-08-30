package _4Lesson;

import java.util.HashSet;

public class PermCheck {
    public static void main(String[] args) {
        int[] A = {0, 1, 2};
        System.out.println(ifPermutation(A));
        //*Here, the programme returns a logical value
        // instead of an integer, as I found this more fitting.

    }

    public static boolean ifPermutation(int[] A) {
        HashSet<Integer> setA = new HashSet<Integer>() {
        };
        HashSet<Integer> setB = new HashSet<Integer>() {
        };

        for (int i = 0; i < A.length; i++) setA.add(A[i]);

        for (int i = 0; i < A.length; i++) setB.add(i + 1);

        if (setB.equals(setA)) {
            return true;
        } else {
            return false;
        }
    }
}
