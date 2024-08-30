package _5Lesson;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class GenomicTry {



    public static void main(String[] args) {

        //String S = "CAGCCTA";
        String S = "CAAATTGCAAA";
        //String S = "CAGCCTMA";
        //String S = "CAGCcTmA";
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};


        System.out.println(genomicSet(S));
        System.out.println(isAGenom(genomicSet(S)));
        System.out.println(genomicMinInASequence(genomicSet(S)));
        System.out.println(genomAssumptions(S, P,Q));


        System.out.println(Arrays.toString(solution(S, P, Q)));

    }

    public static int[] solution(String S, int[] P, int[] Q) {

        int[] genomSolution = new int[P.length];
        if(genomAssumptions(S,P,Q)) {

            for (int i = 0; i < P.length; i++) {
                genomSolution[i] = genomicMinInASequence(partOfAGenom(S, P, Q, i));
            }
            return genomSolution;
        }else{
            return genomSolution;
        }

    }

    public static HashSet<String> genomicSet(String S) {
        String[] genomStringTable = S.split("");
        HashSet<String> genomicSet = new HashSet<String>(List.of(genomStringTable));
        return genomicSet;

    }

    public static boolean isAGenom(HashSet<String> genomicSet) {
        if (genomicSet.size() == 0) {
            return false;
        } else {
            HashSet<String> genomicSet2 = genomicSet;
            genomicSet2.remove("A");
            genomicSet2.remove("C");
            genomicSet2.remove("T");
            genomicSet2.remove("G");
            if (!genomicSet2.isEmpty()) {
                return false;
            } else {
                return true;
            }
        }
    }

    public static int genomicMinInASequence(HashSet<String> genomicSet) {
        if (genomicSet.contains("A")) {
            return 1;
        } else if (genomicSet.contains("C")) {
            return 2;
        } else if (genomicSet.contains("G")) {
            return 3;
        } else {
            return 4;
        }
    }

    public static HashSet<String> partOfAGenom(String S, int[] P, int[] Q, int i) {
        HashSet<String> genomPart = new HashSet<String>();
        String[] genomStringTable = S.split("");
        String[] partGenom = new String[P.length];
        for (int k = P[i]; k <= Q[i]; k++) {
            genomPart.add(genomStringTable[k]);
        }
        return genomPart;
    }


    public static boolean genomAssumptions(String S, int[] P, int[] Q) {
        String[] genomStringTable = S.split("");

        if(!isAGenom(genomicSet(S))) return false;
        if(genomStringTable.length>100000|| genomStringTable.length==0) return false;
        if(P.length>50000|| P.length==0) return false;
        if(P.length!=Q.length) return false;

        for(int i=0;i<P.length;i++){
            if(P[i]>genomStringTable.length || Q[i]>genomStringTable.length||P[i]<0||Q[i]<0 || P[i]>Q[i]) return false;
        }

        return true;

    }

/*
    done N is an integer within the range [1..100,000];
    done M is an integer within the range [1..50,000];
    done each element of arrays P and Q is an integer within the range [0..N - 1];
    done P[K] ≤ Q[K], where 0 ≤ K < M;
    string S consists only of upper-case English letters A, C, G, T.
 */

}