
/**
 * Write a description of class BallRunner here.
 *
 * @author Edward Newell
 * @version 9/19
 */
public class BallRunner
{
    //checks for null to create new balls
    public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        int x = ballBotArray.length;
        for(int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray[i] == null){
                x = i;
            }
        }
        return x;
    }
    //finds the distance between balls
    public static double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }
    //makes sure entrance is clear to spawn balls without fusing them
    public static boolean entranceClear(BallBot[] ballBotArray, TGPoint entrancePoint){
        boolean r = true;
        for(int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray[i] != null){
                if(distanceBetweenPoints(ballBotArray[i].getPoint(), entrancePoint) < (2 * ballBotArray[i].getRadius())){
                    r = false;
                }
            }
        }
        return r;
    }
    //creates the window, the balls, and makes it move
    public static void codeRunner(){
        BallWorld ballWorld = new BallWorld(1200,800);
        BallBot[] ballBotArray = new BallBot[10];
        TGPoint startPoint = new TGPoint(0,0);
        while(true){
            //creates balls if the entrance is clear and there is space for them
            if(findFreeBallBotIndex(ballBotArray) < ballBotArray.length){
                if(entranceClear(ballBotArray, startPoint)){
                    int balls = findFreeBallBotIndex(ballBotArray);
                    ballBotArray[balls] = new BallBot(ballWorld, startPoint, (Math.random() * 360), 25);
                }
            }
            for(int i = 0; i < ballBotArray.length; i++){
                if(ballBotArray[i] != null){
                    BallBot ball = ballBotArray[i];
                    //movement and bouncing
                    if(ball.canMoveForward(ballWorld)){
                        if(ballBotToBounceOff(ballBotArray[i], ballBotArray) == null){
                            ball.moveForward();
                        }else{
                            ball.setHeading((int)(Math.random()*360));
                        }
                    }else{
                        ball.setHeading((int)(Math.random()*360));
                    }
                }
            }
        }
    }
    //balls bouncing 
    public static BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray){
        TGPoint point = ballBot.getPoint();
        TGPoint nextPoint = ballBot.forwardPoint();
        BallBot ret = null;
        boolean C1 = false;
        boolean C2 = false;
        for(int i = 0; i < ballBotArray.length; i++){
            BallBot otherBallBot = ballBotArray[i];
            //checking for impacts based on the balls' radii and where the balls are going
            if(otherBallBot != null && otherBallBot != ballBot && ballBot != null){
                double currentDistance = distanceBetweenPoints(ballBot.getPoint(), otherBallBot.getPoint());
                if(currentDistance <= (ballBot.getRadius() + otherBallBot.getRadius())){
                    double nextDistance = distanceBetweenPoints(nextPoint, otherBallBot.getPoint());
                    if(nextDistance <= currentDistance){
                        ret = otherBallBot;
                    }
                }
            }
        }
        return ret;
    }
}