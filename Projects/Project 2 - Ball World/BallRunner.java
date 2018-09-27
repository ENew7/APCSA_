
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
        for(int i = 0; i < len; i++){
            if(ballBotArray[i] == null){
                len = 1;
            }
        }
        return len;
    }
    public static void act2Runner(){
        BallWorld ballWorld = new BallWorld(750, 750);
        TGPoint tgpoint = new TGPoint((int)(Math.random())*100)+1,(int)(Math.random())*100;
        BallBot[] ballArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while(true){
            for(int i = 0; i < ballArray.length; i++){
                int x = (int)(Math.random
            }
        }
        
    }
}
