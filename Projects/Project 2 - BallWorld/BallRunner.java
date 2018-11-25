
/**
 * Write a description of class BallRunner here.
 *
 * @author Edward Newell
 * @version 9/19
 */
public class BallRunner
{
    //checks for null so it can create new balls
    public static int findFreeBallBotIndex(BallBot[] ballBotArray){
        int z = ballBotArray.length;
        for(int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray[i] == null){
                z = i;
            }
        }
        return z;
    }
    //finds the distance between balls
    public static double distanceBetweenPoints(TGPoint point1, TGPoint point2){
        return Math.sqrt(Math.pow(point1.x - point2.x, 2) + Math.pow(point1.y - point2.y, 2));
    }
    //makes sure enterance is clar so balls dont fuse
    public static boolean entranceClear (BallBot[] ballBotArray, TGPoint entrancePoint){
        boolean t = true;
        for(int i = 0; i < ballBotArray.length; i++){
            if (ballBotArray[i] != null){
                if(distanceBetweenPoints(ballBotArray[i].getPoint(), entrancePoint) < (2 * ballBotArray[i].getRadius())){
                    t = false;
                }
            }
        }
        return t;
    }
    //creates the window, the balls, and makes them move
    public static void ballWorldRunner(){
        BallWorld ballWorld = new BallWorld(1200,800);
        BallBot[] ballBotArray = new BallBot[10];
        TGPoint startPoint = new TGPoint(0,0);
        while(true){
            //mkaes balls when enteracne is clear
            if(findFreeBallBotIndex(ballBotArray) < ballBotArray.length){
                if(entranceClear(ballBotArray, startPoint)){
                    int balls = findFreeBallBotIndex(ballBotArray);
                    ballBotArray[balls] = new BallBot(ballWorld, startPoint, (Math.random() * 360), 25);
                }
            }
            for(int i = 0; i < ballBotArray.length; i++){
                if(ballBotArray[i] != null){
                    BallBot ball = ballBotArray[i];
                    //balls bouncing around
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
    //bouncing when balls hit each other
    public static BallBot ballBotToBounceOff(BallBot ballBot, BallBot[] ballBotArray){
        TGPoint point = ballBot.getPoint();
        TGPoint nextPoint = ballBot.forwardPoint();
        BallBot ret = null;
        boolean C1 = false;
        boolean C2 = false;
        for(int i = 0; i < ballBotArray.length; i++){
            BallBot otherBallBot = ballBotArray[i];
            //checking for impacts based on radii and where the balls will be
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