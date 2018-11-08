
/**
 * Write a description of class GridTester here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GridTester
{
    public static int[][] mat = new int[10][10];
    public static void loadArray(){
        for( int r = 0; r < mat.length; r++){
            for( int c = 0; c < mat[r].length; c++){
                mat[r][c] = (int)(Math.random()*100) + 1;
            }
        }
    }
    public static int sumAll(){
        int sum = 0;
        for( int r = 0; r < mat.length; r++){
            for( int c = 0; c < mat[r].length; c++){
                sum += mat[r][c];
            }
        }
        return sum;
    }
    public static int findGreatest(){
        int greatest = 0;
        for( int r = 0; r < mat.length; r++){
            for( int c = 0; c < mat[r].length; c++){
                if(mat[r][c] > greatest){
                    greatest = mat[r][c];
                }
            }
        }
        return greatest;
    }
    public static int numberOfGreatest(){
        int number = 0;
        int greatest = 0;
        for( int r = 0; r < mat.length; r++){
            for( int c = 0; c < mat[r].length; c++){
                if(mat[r][c] > greatest){
                    greatest = mat[r][c];
                }
            }
        }
        for( int r = 0; r < mat.length; r++){
            for( int c = 0; c < mat[r].length; c++){
                if(mat[r][c] == greatest){
                    number ++;
                }
            }
        }
        return number;
    }
    public static double findAvg(){
        double average = 0;
        for( int r = 0; r < mat.length; r++){
            for( int c = 0; c < mat[r].length; c++){
                average += mat[r][c];
            }
        }
        average = average / 100;
        return average;
    }
    public static void main(){
        loadArray();
        for( int r = 0; r < mat.length; r++){
            for( int c = 0; c < mat[r].length; c++){
                System.out.println(mat[r][c]);
            }
        }
        findGreatest();
        numberOfGreatest();
        findAvg();
    }
}
