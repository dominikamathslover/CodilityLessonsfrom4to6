package _5Lesson;

public class MinAvgTwoSliceNew {
    public static void main(String[] args) {
        int[] A = {4,2,2,5,1,5,8};
        System.out.println(solution(A));

    }

    public static int solution(int[] A) {
        int[] partialSums = partialSums(A);
        int minStart = 0;
        double minAvg = (double) partialSums[partialSums.length - 1] / A.length;

        double tmpAvg;
        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                tmpAvg = average(partialSums, i, j);
                if (tmpAvg < minAvg) {
                    minAvg = tmpAvg;
                    minStart = i;
                }
            }
        }
        return minStart;
    }


    public static double average(int[] partialSums, int i, int j) {
        int sum = partialSums[j] - (i > 0 ? partialSums[i - 1] : 0);
        return (double) sum / (j - i + 1);
    }


    public static int[] partialSums(int[] A) {
        int[] partSum = new int[A.length];

        partSum[0] = A[0];

        for (int i = 1; i < A.length; i++) {
            partSum[i] = A[i] + partSum[i - 1];
        }
        return partSum;
    }


}

