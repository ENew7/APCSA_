
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
        //creats the ball
        while(true){
            if(ballBot.canMoveForward(ballWorld) == true){
                ballBot.moveForward();
            }   
            else{
                ballBot.setHeading(ballBot.getHeading()+90);
            }
        }
        //moves the ball
    }
    //^creates a ball at (0,0), has ball ride along the wall
    public int findFreeBallBotIndex(BallBot[] ballBotArray){
        int len = ballBotArray.length;
        for(int i = 0; i < len; i++){
            if(ballBotArray[i] == null){
                len = 1;
            }
        }
        return len;
    }
    //finds open space in array
    public static void act2Runner(){
        BallWorld ballWorld = new BallWorld(750, 750);
        TGPoint tgpoint = new TGPoint(Math.random()*100, Math.random()*100);
        BallBot[] ballArray = new BallBot[10];
        BallRunner ballRunner = new BallRunner();
        while(true){
            for(int i = 0; i < ballArray.length; i++){
                if(ballRunner.findFreeBallBotIndex(ballArray) < ballArray.length){
                   BallBot ballBot = new BallBot(ballWorld, tgpoint, Math.random()*360, 25);
                   ballArray[i] = ballBot;
                }
                //makes ballBots
                if(ballArray[i]!=null){
                    if(ballArray[i].canMoveForward(ballWorld) == true){
                        ballArray[i].moveForward();
                    }
                    else{
                        ballArray[i].setHeading(ballArray[i].getHeading()+90);
                    }
                }
                //moves ballBots
            }
        }
        
    }
    public double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        return Math.sqrt(Math.pow(point1.x-point2.x,2.0)+(Math.pow(point1.y-point2.y,2.0)));
    }
    //finds distance between points
    public boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){
        for(int i = 0; i < ballBotArray.length; i++){
            if(ballBotArray[i] != null){
                
            }
        }
    }
}
