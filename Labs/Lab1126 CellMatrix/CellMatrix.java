
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
        
        return 0;
    }
    //  Load neighbor cells into the neighbors array
    public void loadNeighbors(int row, int col){
        if(row = 1 || row = 4
    }
    
}
