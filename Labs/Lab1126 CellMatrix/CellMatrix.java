
/**
 * 
 * CellMatrix
 * @author (eettlin) 
 * @version (11-26-18)
 */
public class CellMatrix{
    /**
     * +++++++++++++++++++++Instance variables
     */
    
    private Cell[][] cells;

    /**
     * +++++++++++++++++++++Constructor for objects of class NumberMatrix
     */
    public CellMatrix(int a, int b){
       cells = new Cell[a][b];
       
    }

    /**
     * +++++++++++++++++++++++++++++++++++++++++++++++++++++++methods
     */
    //Print each row and column of nums to the console
    public void printMatrix(){
        for(int i = 0; i < cells.length; i++){
            for(int j = 0; j < cells[i].length; j++){
                System.out.print(cells[i][j].getInt() + ", ");
           }
           System.out.println();
        }
        
    }
    //  load nums with random with numbers between 1 and 10 inclusive
    public void loadMatrix(){
       for(int i = 0; i < cells.length; i++){
           for(int j = 0; j < cells[i].length; j++){
               cells[i][j] = new Cell((int)(Math.random()*10)+1);
           }
       }
    }
    //  Findis the sum of each of the neighbors and returns the greatest 
    // neighbor value
    
    public int getGreatestNeighbors(){
       int greatest = 0;
        for(int i = 0; i < cells.length; i++){
           for(int j = 0; j < cells[i].length; j++){
               if(cells[i][j].getNeighborSum() > greatest){
                   greatest = cells[i][j].getNeighborSum();
                }
           }
       }
        return 0;
    }
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(int row, int col){
       for(int i = 0; i < cells.length; i++){
           for(int j = 0; j < cells[i].length; j++){
               if(i>0){ //get north
                   cells[i][j].getNeighbors()[0] = cells[i-1][j];
               }
               if(j>0){ //get west
                   cells[i][j].getNeighbors()[0] = cells[i][j-1];
               }
               if(j>cells[0].length){ //get east
                   cells[i][j].getNeighbors()[0] = cells[i][j+1];
               }
               if(i>cells[0].length){ //get south 
                   cells[i][j].getNeighbors()[0] = cells[i+1][j];
               }
           }
       }
    }
    
}
