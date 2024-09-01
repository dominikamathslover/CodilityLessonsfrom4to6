package _5Lesson;

import java.util.ArrayList;

public class PassingCars {
    public static void main(String[] args) {
        int[] A = {1, 0, 1, 0, 0, 1, 1};

        // Less effective method - compare with PassingCarsNew
        // complexity o(n^2)
        System.out.println(passCars(A));



    }

    public static int passCars(int[] A) {
        ArrayList<Integer> zeros = new ArrayList<Integer>();
        ArrayList<Integer> ones = new ArrayList<Integer>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                zeros.add(i);
            } else {
                ones.add(i);
            }
        }

        int N = ones.size();
        int pairs = 0;
        for (int i = 0; i < zeros.size(); i++) {
            for (int k = 0; k < N; k++)
                if (zeros.get(i) < ones.get(k)) pairs = pairs + 1;
        }
        return pairs;
    }


}
