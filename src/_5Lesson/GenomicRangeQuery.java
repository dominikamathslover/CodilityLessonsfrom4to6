package _5Lesson;

import java.util.HashSet;
import java.util.List;

public class GenomicRangeQuery {
    public static void main(String[] args) {
        String[] S = {"C", "A", "G", "C", "C", "T", "A"};
        int[] P = {2, 5, 0};
        int[] Q = {4, 4, 5};
        int[] table = genomicSeq(S, P, Q);

        for (int i = 0; i < table.length; i++) {
            System.out.print(table[i] + ", ");
        }


        int[] genom = new int[P.length];

        for (int i = 0; i < P.length; i++) {
            for (int k = P[i]; k < Q[i]; k++) {
                switch (S[k]) {
                    case "A":
                        genom[k]=1;
                        k=Q[i];
                        break;
                    case "C":
                        genom[k]= 2;
                        break;
                    case "G":
                        genom[k]=3;
                        break;
                    case "T":
                        genom[k]=4;
                        // code block
                }
            }
        }

        for (int i = 0; i < genom.length-1; i++) {
            System.out.print(genom[i] + ", ");
        }

    }

    public static int[] genomicSeq(String[] S, int[] P, int[] Q) {
        HashSet<String> impactFactorsS = new HashSet<String>(List.of(S));
        String[] basic = {"A", "C", "T", "G"};
        HashSet<String> impactFactorsBasic = new HashSet<String>(List.of(basic));
        HashSet<String> difference = new HashSet<String>();

        int[] genom = new int[P.length];

        int M = P.length;
        int N = S.length;

        if (P.length != Q.length) {
            return genom;
        }

        if (S.length < 1 || S.length > 100000) {
            return genom;
        }

        if (M < 1 || M > 50000) {
            return genom;
        }

        if (impactFactorsS.size() > 4) {
            return genom;
        }

        for (String i : impactFactorsS) {
            if (!impactFactorsBasic.contains(i)) {
                return genom;
            }
        }

        for (int i = 0; i <= P.length; i++) {
            if (P[i] > Q[i] || P[i] >= N || P[i] < 0 || Q[i] >= N || Q[i] < 0) {
                return genom;
            }
        }

        for (int i = 0; i < P.length; i++) {
            for (int k = P[i]; k < Q[i]; k++) {
                switch (S[k]) {
                    case "A":
                        genom[k]=1;
                        k=Q[i];
                        break;
                    case "C":
                        genom[k]= 2;
                        break;
                    case "G":
                        genom[k]=3;
                        break;
                    case "T":
                        genom[k]=4;
                        // code block
                }
            }
        }

        //A, C, G and T have impact factors of 1, 2, 3 and 4,
        return genom;
    }
}
