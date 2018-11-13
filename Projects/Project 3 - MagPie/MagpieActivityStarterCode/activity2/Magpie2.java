/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 extends MagpieRunner2
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        //checks keywords and returns a statement
        if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        else if (statement.indexOf("dog") >= 0
                || statement.indexOf("cat") >= 0
                || statement.indexOf("fish") >= 0
                || statement.indexOf("turtle") >= 0)
        {
            response = "Tell me more about your pets.";
        }
        else if (statement.indexOf("Mr. Ettlin") >= 0
                || statement.indexOf("Mr. Malloy") >= 0)
        {
            response = "He sounds like a good teacher.";
        }
        //tests to see if anything waas typed
        else if  (statement.trim().equals("")){
            response = "Say something, please";
        }
        else if (statement.indexOf("Darth Plagueis the Wise") >= 0)
        {
            response = "Did you ever hear the tragedy of Darth Plagueis the Wise? \n I thought not. It's not a story the Jedi would tell you. /n It's a Sith legend. Darth Plagueis was a Dark Lord of the Sith, /n so powerful and so wise he could use the Force to influence the /nmidi-chlorians to create life. ... He had such a knowledge of the dark side that he could even keep the ones he cared about from dying. The dark side of the Force is a pathway to many abilities some consider to be unnatural.He became so powerful … the only thing he was afraid of was losing his power, which eventually, of course, he did. Unfortunately, he taught his apprentice everything he knew, then his apprentice killed him in his sleep. (smiles) Plagueis never saw it coming. It's ironic he could save others from death but not himself.";
        }
        else if (statement.indexOf("Is it possible to learn this power") >= 0)
        {
            response = "Not from a jedi.";
        }
        else if (statement.indexOf("all star") >= 0)
        {
            response = "SOMEbody once told me the world's gonna roll me, I ain't the sharpest tool in the shed...";
        }
        else
        {
            response = getRandomResponse();
        }
        return response;
    }

    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    private String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 5;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        //gives a random genric response
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
                    response = "You don't say.";
        }
        else if (whichResponse == 4)
	{
		response = "Ok.";
	}
	else if (whichResponse == 5)
	{
		response = "Uh huh.";
	}
        return response;
    }
}
