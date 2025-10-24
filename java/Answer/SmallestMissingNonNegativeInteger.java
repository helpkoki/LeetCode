package Answer;

public class SmallestMissingNonNegativeInteger {
    private int questionId = 2598 ;


    static int createLittleArray(int [] num , int value){

        int mex = 0;
        for(int x = 0 ; x < num.length ; x++){
            // if(num[x] < mex  && num[x] < value  ){

            while(num[x] > mex && num[x] > value){
                if(num[x] > value ){

                    num[x] = -value;
                    System.out.println("less:" + num[x]);
                }else{

                    num[x] = +value;
                    System.out.println("more" + num[x]);
                }
                mex ++;
            }
            // }

        }
        return mex;
    }
}
