package _5Lesson;

public class CountDiv {
    public static void main(String[] args) {
        int A = 5;
        int B = 32;
        int K = 1;

        System.out.println(counterMethod(A, B, K));

        int dzialanie1 = B/K;
        int dzialanie2 = A/K;
        int dzialanie3 = B / K - A / K + 1;

        System.out.println(dzialanie1 + " "+ dzialanie2+ " "+ dzialanie3);

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