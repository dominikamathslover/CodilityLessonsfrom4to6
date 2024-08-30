package _6Lesson;

import java.util.HashSet;

public class Distinct {

    public static void main(String[] args) {

        int[] A = {1, 2, 3,5,3,3,3,3,4,4,4,4,4,4,4,4,4,10};
        System.out.println(diff(A));

    }


    public static int diff(int[] A) {
        HashSet<Integer> setA = new HashSet<Integer>();

        for (int i = 0; i < A.length; i++) {
            setA.add(A[i]);
        }
        return setA.size();
    }
}
