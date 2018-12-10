import java.util.*;
/**
 * Hand class
 *
 * @author Edward Newell
 * @version 1108
 */
public class Hand
{
    private ArrayList<Card> hand;
    Deck d = new Deck();
    //hand.add(d.getCard());
    
    public boolean sameSuit(){
        
        return true;
    }
    public int onePair(){
        return -1;
    }
}
