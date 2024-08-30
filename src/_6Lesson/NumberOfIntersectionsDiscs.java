package _6Lesson;

public class NumberOfIntersectionsDiscs {


    public static void main(String[] args) {

       //int[] A = {1,1,1};
        int[] A = {1, 10, 100, 1};
        //int[] A={1};
        //int[] A = {1, 5, 2, 1, 4, 0};

        System.out.println(solution(A));

    }


    public static int solution(int[] A) {
        int numberOfIntersection = 0;
        int numberOfBigNumbers = 0;
        if (A.length == 1) {
            return numberOfIntersection;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] >= A.length ) {
                numberOfIntersection = numberOfIntersection + A.length - 1 - numberOfBigNumbers;
                numberOfBigNumbers = numberOfBigNumbers + 1;
                if (tooMuchNumberOfIntersection(numberOfIntersection)) return -1;
            } else {
                for (int j = i + 1; j < A.length && A[j] < A.length ; j++) {
                    if (A[i] + A[j] >= j - i) {
                        numberOfIntersection = numberOfIntersection + 1;
                        if (tooMuchNumberOfIntersection(numberOfIntersection)) return -1;
                    }
                }
            }
        }

        return numberOfIntersection;
    }

    public static boolean tooMuchNumberOfIntersection(int numberOfIntersection) {
        if (numberOfIntersection > 10000000) {
            return true;
        } else {
            return false;
        }


    }
}

