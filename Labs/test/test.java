import java.util.*;
/**
 * Write a description of class test here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class test
{
    public static String transformILike(String str){
        String output = "";
        String subject = "";
        ArrayList<String> phrases = new ArrayList<String>();
        phrases.add("Why do you like ");
        phrases.add("Do you eat ");
        phrases.add("What are ");
        phrases.add("What color are ");
        subject = str.substring(str.indexOf("I like ")+7);
        output = phrases.get((int)(Math.random() * 4)) + subject + "?";
        return output;
    }
}
