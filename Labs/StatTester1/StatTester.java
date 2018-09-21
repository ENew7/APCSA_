/**
 * StatTester finds loads an Array of int
 * and finds the sum, mean, median, and mode.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// imports go here
import java.util.Arrays;
public class StatTester{
   //  Instance variables
   private int[] nums;
  
   // Constructor
   public StatTester(){
       nums = new int[100];
   }
  
  
   //  Methods
   public void loadArray(){
       for(int i = 0; i < nums.length; i++){
           nums[i]= (int)(Math.random()*10+1);
       }
   }
  
   public void printArray(){
       Arrays.sort(nums);
       for(int i=0; i<nums.length; i++){
           if(i%10==0){
               System.out.println();
           }
           System.out.print(nums[i]+ ", ");
       }
  
   }

   public int getSum(){
     int x = 0;
     for(int i=0; i<nums.length; i++){
           x+=nums[i];
       }
     return x;
   }
   public double getMean(){
     double x = 0.0;
     double y = 0.0000000;
     for(int i=0; i<nums.length; i++){
           x+=nums[i];
           y=x/100;
       }
     return y;
   }
   public double getMedian(){
    int y = 0;
    Arrays.sort(nums);
     if(nums.length%2==0){
       y = nums[nums.length/2] + nums[(nums.length/2)+1];
       y = y/2;
     }
     else{
       y = nums[nums.length/2];

     }
     return y;
   }
    public int getMode() {
        
        int maxCounts = 0;
        int maxKey = 0;
        int[] counts = new int[nums.length];
        for (int i=0; i < nums.length; i++) {
            counts[nums[i]]++;
            if (maxCounts < counts[nums[i]]) {
                maxCounts = counts[nums[i]];
                maxKey = nums[i];
            }
        }
        return maxKey;
    }
}