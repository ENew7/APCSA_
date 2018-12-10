
import java.util.*;
/**
 * Runner class
 *
 * @author Edward Newell
 * @version 1108
 */
public class Deck
{
    private ArrayList<Card> cards;

    public Deck()
    {
        cards = new ArrayList<Card>();

        for(int a =0; a<=3; a++)
        {
            for(int b =0; b<=12;b++)
            {
                cards.add(new Card(a,b));
                
            }
        }
        System.out.println(cards);
    }

    public Card getCard()
    {
        Random generator = new Random();
        int index = generator.nextInt(cards.size());
        return cards.remove(index);
    }

        
}
