package _6Lesson;

import java.util.ArrayList;
import java.util.Comparator;

public class Triangle {


    public static void main(String[] args) {

        //int[] A = {Integer.MAX_VALUE,Integer.MAX_VALUE,Integer.MAX_VALUE};
        int[] A={1,3,4,5,5};

        System.out.println(isTriangle(A));

    }

    public static int isTriangle(int[] A) {

        if (onlyPositiveSetA(A).size() < 3) {
            return 0;
        }

        ArrayList<Integer> cleanA = onlyPositiveSetA(A);
        int N = cleanA.size() - 1;

        for (int i = N; i >= 2; i--) {
            if (cleanA.get(i - 2).equals(cleanA.get(i - 1) )&& cleanA.get(i - 2).equals(cleanA.get(i))) {
                return 1;
            }
            if (cleanA.get(i - 2) + cleanA.get(i - 1) > cleanA.get(i)) {
                return 1;
            }
        }
        return 0;
    }

    public static ArrayList<Integer> onlyPositiveSetA(int[] A) {
        ArrayList<Integer> positiveList = new ArrayList<Integer>();

        for (int i = A.length - 1; i >= 0; i--) {
            if (A[i] > 0) {
                positiveList.add(A[i]);
            } else {
                i = 0;
            }
        }
        positiveList.sort(Comparator.naturalOrder());
        return positiveList;
    }

}