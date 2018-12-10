import java.util.*;
/**
 * Runner class
 *
 * @author Edward Newell
 * @version 1108
 */
public class Card
{
    int rank = 0;
    String suit = "";
    int[] ranks = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};
    String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
    public Card(int a, int b){
       rank = ranks[a];
       suit = suits[b];
       
    }
}
