package _6Lesson;

import java.util.Arrays;

public class TriangleFromThreeElements {
    public static void main(String[] args){
        int[] A={3,4,1};

        System.out.println(ifAllPositive(A));
        System.out.println(isTriangle(A));

    }

    public static int isTriangle(int[] A){
        if(!ifAllPositive(A)) return 0;

        Arrays.sort(A);
        if(A[0]+A[1]>A[2]){
            return 1;
        }else{
            return 0;
        }

    }

    public static boolean ifAllPositive(int[] A){
        if(A.length!=3) {
            return false;
        }
        if(A[0]<=0|| A[1]<=0||A[2]<=0) {
            return false;
        }
        return true;
    }


}
