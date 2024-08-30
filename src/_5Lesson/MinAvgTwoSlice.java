package _5Lesson;

public class MinAvgTwoSlice {
    public static void main(String[] args) {
        int[] A = {5, 6, 3, 4, 9};
        //int i =3;
        //int j =5;
        //System.out.println(A.length);

        //System.out.println(average(A,i,j));
        //System.out.println(averageMinI(A,i));
        System.out.println(averageMinIJ(A));

        System.out.println(" ");

        System.out.println(averageMinI(A, 0));
        System.out.println(averageMinI(A, 1));
        System.out.println(averageMinI(A, 2));
        System.out.println(averageMinI(A, 3));
        //System.out.println(averageMinI(A, 4));
        //System.out.println(averageMinI(A, 5));

    }


    public static int averageMinIJ(int[] A) {
        double minAvIj = averageMinI(A, A.length - 2);
        int index = A.length - 2;

        for (int i = 0; i <=A.length - 2; i++) {
            if (averageMinI(A, i) < minAvIj) {
                minAvIj = averageMinI(A, i);
                index=i;
            }
        }
        //return index;

        return index;

    }



    public static double averageMinI(int[] A, int i) {
        if (i < A.length - 1) {
            double minAvI = average(A, i, i + 1);
            for (int j = i + 2; j < A.length; j++) {
                minAvI = Math.min(average(A, i, j), minAvI);
            }
            return minAvI;
        } else {
            return 0;
        }
    }


    public static double average(int[] A, int i, int j) {
        int sum = 0;
        double average = 0;
        if (i != j && i >= 0 && j >= 0 && i < A.length && j < A.length) {

            for (int k = i; k <= j; k++) {
                sum = sum + A[k];
            }
            average = (double) sum / (j - i + 1);

            return average;
        } else {
            return 0;
        }
    }
}

