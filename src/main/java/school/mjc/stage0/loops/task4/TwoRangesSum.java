package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int s=0,k=0;
         if(lastInRow<0){
            System.out.println("last number in row is negative");
        }else if(numberToSkip > lastInRow){
            System.out.println("number to skip is bugger then the last");
        }else{
            for (int i = 1; i <= lastInRow; i++) {
                s+=i;
                if(i==numberToSkip){
                    break;
                }
                
            }
            for (int i = numberToSkip+1; i <= lastInRow; i++) {
                k+=i;
                
                
            }
            System.out.println("skipped sum is "+s); 
            System.out.println("counted sum is "+k);
        }
    }
}
