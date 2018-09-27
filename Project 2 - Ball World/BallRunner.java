
/**
 * Write a description of class BallRunner here.
 *
 * @author Edward Newell
 * @version 9/19
 */
public class BallRunner
{
    public static void run(){
        BallWorld ballWorld = new BallWorld(200, 200);
        TGPoint startPoint = new TGPoint(0, 0);
        BallBot ballBot = new BallBot(ballWorld, startPoint, 0.0, 25);  
        while(true){
            if(ballBot.canMoveForward(ballWorld) == true){
                ballBot.moveForward();
            }   
            else{
                ballBot.setHeading(ballBot.getHeading()+90);
            }
        }
    }
    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        int len = ballBotArray.length;
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] == null){
                len = 1;
            }
        }
        return len;
    }
    public static void act2Runner(){
        BallWorld ballWorld = new BallWorld(250, 250);
        TGPoint tgpoint = new TGPoint(0, 0);
        
    }
}
