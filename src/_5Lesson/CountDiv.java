package _5Lesson;

public class CountDiv {
    public static void main(String[] args) {
        int A = 5;
        int B = 32;
        int K = 2;

        result(A,B,K);


    }

    public static void result(int A, int B, int K){
        System.out.println("Compute number of integers divisible by "+ K +" in range"+" ["+A+", "+B+"]");
        System.out.println(counterMethod(A, B, K));
    }

    public static int counterMethod(int A, int B, int K) {
        final int MAX = 2000000000;

        int counter = 0;

        while(K==1){
            counter = B-A+1;
            return counter;
        }

        if (A <= B && K > 0 && K <= MAX && B <=MAX) {
            if (A < K && A!=0) {
                counter = B / K;
            } else {
                for (int i = A; i <= B; i++) {
                    if (i % K == 0 && A% K==0) {
                        counter =  B / K - A / K + 1;
                        i = B;
                    } else if (i % K == 0 && A% K!=0) {
                        counter =  B / K - A / K ;
                        i = B;
                    }
                }
            }
        } else{
                counter = -1;
            }
            return counter;
        }
    }