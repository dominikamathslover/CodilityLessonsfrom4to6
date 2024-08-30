package _5Lesson;

import java.util.Arrays;

public class GenomicTryNew {


    public static void main(String[] args) {

        String S = "CAGCCTA";
        //String S = "CAAATTGCAAA";
        //String S = "CAGCCTMA";
        //String S = "CAGCcTmA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};


        System.out.println(Arrays.toString(solution(S, P, Q)));


        // System.out.println(Arrays.toString(solution(S, P, Q)));

    }

    public static int[] solution(String S, int[] P, int[] Q) {
        int[] translatedGenom = new int[S.length()];
        int[] genomSolution = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            translatePart(S, translatedGenom, P[i], Q[i]);
            genomSolution[i] = (getMinFromPartOfGenom(translatedGenom, P[i], Q[i]));
        }
        return genomSolution;
    }

    public static void translatePart(String S, int[] translatedGenom, int p, int q) {
        for (int i = p; i <= q; i++) {
            switch (S.charAt(i)) {
                case 'A':
                    translatedGenom[i] = 1;
                    break;
                case 'C':
                    translatedGenom[i] = 2;
                    break;
                case 'G':
                    translatedGenom[i] = 3;
                    break;
                case 'T':
                    translatedGenom[i] = 4;
                    break;
                default:
                    throw new IllegalArgumentException("It is not a genom!");
            }
        }
    }

    public static int getMinFromPartOfGenom(int[] genomIntTable, int p, int q) {
        int min = genomIntTable[p];
        for (int k = p; k <= q; k++) {
            if (genomIntTable[k] < min) {
                min = genomIntTable[k];
            }
        }
        return min;
    }


}



/*
    public static int[] stringToIntArray(String S) {
        String[] genomStringTable = S.split("");
        int[] genomIntTable = new int[genomStringTable.length];


        for (int i = 0; i < genomStringTable.length; i++) {
            switch (genomStringTable[i]) {
                case "A":
                    genomIntTable[i] = 1;
                    break;
                case "C":
                    genomIntTable[i] = 2;
                    break;
                case "G":
                    genomIntTable[i] = 3;
                    break;
                case "T":
                    genomIntTable[i] = 4;
                    break;
                default:
                    throw new IllegalArgumentException("It is not a genom!");
            }
        }
        return genomIntTable;

    }

    public static boolean isAGenom(int[] genomIntTable) {
        return genomIntTable.length != 0;
    }

 */



/*
    done N is an integer within the range [1..100,000];
    done M is an integer within the range [1..50,000];
    done each element of arrays P and Q is an integer within the range [0..N - 1];
    done P[K] ≤ Q[K], where 0 ≤ K < M;
    string S consists only of upper-case English letters A, C, G, T.
 */

