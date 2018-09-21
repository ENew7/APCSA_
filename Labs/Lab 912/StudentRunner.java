
/**
 * Write a description of class StudentRunner here.
 *
 * @author Edward Newell
 * @version 9/12
 */

public class StudentRunner
{
    
    public static void main(){
       String[] names = {"Dylan", "Marthe", "Edward", "Guy", "Cameron"};
       int[] studNum = {111111, 222222, 333333, 444444, 555555};
       for (int i = 0; i < names.length; i++){
         System.out.println(names[i] + " " + studNum[i]);
        }
    }
}