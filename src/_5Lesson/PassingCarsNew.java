package _5Lesson;

public class PassingCarsNew {

    public static void main(String[] args) {
        int[] A = {1, 0, 1, 0, 0, 1, 1};

        System.out.println(passCars(A));

    }
    public static int passCars(int[] A){
        int zerosbeforeone =0;
        int total =0;
        for(int i:A){
            if(i==0){
                zerosbeforeone=zerosbeforeone+1;
            }else{
                total=total+zerosbeforeone;
                if (total > 1000000000) return -1;
            }
        }
        return total;
    }
}
