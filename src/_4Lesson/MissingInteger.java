package _4Lesson;

import java.util.HashSet;

public class MissingInteger {
    public static void main(String[] args) {
        int[] A = {-2,-5,1,3,4,5};

        System.out.println(missingIntNew(A));

    }

    public static int missingIntNew(int[] A) {
        HashSet<Integer> setA = new HashSet<Integer>();

        int missing = 1;

        while (A.length == 0) return missing = 1;

        for (int i = 0; i < A.length; i++) {
            if (A[i] > 0) {
                setA.add(A[i]);
            }
        }

        while (setA.isEmpty()) return missing = 1;

        System.out.println(setA);

        for(int i=1; i<setA.size()+1;i++){
            if(setA.contains(i)){
                missing=i+1;
            }else{
                missing=i;
                i=setA.size();
            }
        }
        return missing;
    }
}

