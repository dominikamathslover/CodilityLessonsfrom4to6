package _5Lesson;

public class GenomicRangeQueryNew {
    public static void main(String[] args) {
        //System.out.println("Tworzymy tablicę dwuwymiarową");

        String S = "CAGCCTA";
        int[] P = {2,5,0};
        int[] Q = {4,5,6};
        int[] table = solveGenomicRange(S, P, Q);

        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + ", ");
        }
    }


    public static int[] solveGenomicRange(String S, int[] P, int[] Q) {
        int[][] genoms = new int[3][S.length() + 1];

        char currentChar;

        for (int i = 0; i < S.length(); i++) {
            currentChar = S.charAt(i);
            genoms[0][i + 1] = genoms[0][i] + (currentChar == 'A' ? 1 : 0);
            genoms[1][i + 1] = genoms[1][i] + (currentChar == 'C' ? 1 : 0);
            genoms[2][i + 1] = genoms[2][i] + (currentChar == 'G' ? 1 : 0);
        }

        int[] result = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            int fromIndex = P[i];
            int toIndex = Q[i] + 1;
            if (genoms[0][toIndex] - genoms[0][fromIndex] > 0) {
                result[i] = 1;
            } else if (genoms[1][toIndex] - genoms[1][fromIndex] > 0) {
                result[i] = 2;
            } else if (genoms[2][toIndex] - genoms[2][fromIndex] > 0) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }
        }

        return result;
    }
}
