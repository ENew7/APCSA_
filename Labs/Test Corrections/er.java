
/**
 * Write a description of class Quiz1Corrections here.
 *
 * @author Edward Newell
 * @version 10/2/18
 */
public class er
{
    public static void main(){
        //#2
        //int x = 4%47 + 10%3 + 15/4;
        //System.out.println(x);
        //answer: c
        //#3
        //int y = (int)(Math.random()*11)+10;
        //System.out.println(y);
        //answer: c
        //#5
        //int num = 6;
        //if(num/3 < 2){
           // System.out.print("First");
        //}else if(num%4 <= 2){
          //  System.out.print("Second");
        //}else{
           // System.out.print("Third");
        //}
        //System.out.print("Fourth");
        //answer: b
        //#7
        /*
         * public double aveArr(){
         *     double average = 0.0;
         *     int sum = 0;
         *     for(int i = 0; i < length.nums; i++){
         *         sum += nums[i];
         *     }
         *     average = sum/length.nums;
         *     return average;
         *  }
         */
        //#8
        /*
         * public int sumArr(int[] s){
         * int sum = 0; 
         * for(int i = 0; i < length.sum3; i++){
         *    sum += sum3[i];        
         * }
         * return sum;
         * }
        */
        //#10
        /*
         * public class Pumpkin{
         *     int num;
         *     public Pumpkin(){
         *         num = 0;
         *     }
         *     public int getNumber() {
         *         return this.num;
         *     }
         *     public void setNumber(int z) {
         *         this.num = z;
         *     }
         * }
         */
        //#11
        
        public int digitsSum(int num){
             int sum = 0;
             while (num > 0) {
                 sum = sum + num % 10;
                 num = num / 10;
             }
         return sum;
         }
        
    }
}
