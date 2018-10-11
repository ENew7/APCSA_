
/**
 * Write a description of class SentenceBuilder here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SentenceBuilder
{
    public static String[] nouns = {"Thomas the Tank Engine ", "moth ", "continent of Africa ", "Danny DeVito ", "puppy ", "pizza ", "tower ", "boy ", "girl ", "attack helicopter ", "dwarf "};
    public static String[] verbs = {"flies ","jumps ","dances ","runs ","sings ","licks ","eats ","slides ","climbs ","kicks "};
    public static String[] determiners = {"My ", "The ", "My ", "Her ", "His ", "Our "};   
    public static String[] adjectives = {"Creepy ", "Slippery ", "Moist ", "Tiny ", "Old ", "Fat "};
    public static String[] adverbs = {"Quickly ", "Happily ", "Smoothly ", "Often ", "Sadly ", "Never "};
    public static String[] prepositions = {"Over ", "Near ", "Behind ", "Under ", "Next To ", "On Top Of "};
    public static String nounPhrase = "";
    public static String verbPhrase = "";
    public static String prepositionalPhrase = "";
    
    public static void loadSentences(){
        SentenceBuilder sb = new SentenceBuilder();
        System.out.print(sb.getNounPhrase() + sb.getVerbPhrase() + sb.getPrepositionalPhrase());
    }

    public String getNounPhrase(){
        nounPhrase = getRandomDeterminer() + getRandomAdjective() + getRandomNoun();
        return nounPhrase;
    }
    
    public String getVerbPhrase(){
        verbPhrase = getRandomAdverb() + getRandomVerb();
        return verbPhrase;
    }
    
    public String getPrepositionalPhrase(){
        prepositionalPhrase = getRandomPreposition() + getRandomDeterminer() + getRandomAdjective() + getRandomNoun();
        return prepositionalPhrase;
    }
    
    public String getRandomDeterminer(){
        int determinerChoice = (int)((Math.random() * determiners.length));
        return determiners[determinerChoice];
    }
    
    public String getRandomNoun(){
        int nounChoice = (int)((Math.random() * nouns.length));
        return nouns[nounChoice];
    }
    
    public String getRandomVerb(){
        int verbChoice = (int)((Math.random() * verbs.length));
        return verbs[verbChoice];
    }
    
    public String getRandomAdjective(){
        int adjectiveChoice = (int)((Math.random() * adjectives.length));
        return adjectives[adjectiveChoice];
    }
    
    public String getRandomPreposition(){
        int prepositionChoice = (int)((Math.random() * prepositions.length));
        return prepositions[prepositionChoice];
    }
    
    public String getRandomAdverb(){
        int adverbChoice = (int)((Math.random() * adverbs.length));
        return adverbs[adverbChoice];
    }
}