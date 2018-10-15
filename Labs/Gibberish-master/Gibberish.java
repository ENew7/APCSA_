
/**
 * Write a description of class Gibberish here.
 *
 * @author Edward Newell
 * @version 10/15
 */
public class Gibberish
{
    private String sourceString;
    public Gibberish(){
        Template template = new Template();
        sourceString = template.getSourceString();
    }
    public String makeGibberish(WordList5000 wordList5000){
        int currentSourceIndex = 0;
        String resultString = " ";
        while(sourceString.contains("<")){
            int beginning = sourceString.indexOf("<");
            if(sourceString.indexOf("<t>") == beginning){
                int end = sourceString.indexOf("</>");
                if(wordList5000.getRandomWordString("t") != null){
                    
                }
            }
        }
    }
}
