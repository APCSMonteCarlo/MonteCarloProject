
/**
 * Monte Carlo Project
 * 
 * @author (Brandon Kennedy) 
 * @version (1.00)
 */

import java.util.Random;

public class MonteCarlo
{
    public double rr;
    public double xx;
    public double yy;
    
    
    public MonteCarlo(double h, double k, double r)
    {
        rr = r;
        xx = h;
        yy = k;
    }
    
    private Random rndm;
    
    public double nextRainDrop_x()
    {
       double pointX = (xx * 2) * rndm.nextDouble() + (xx-rr);
       return pointX;
    }
    
    public double nextRainDrop_y()
    {
        double pointY = (yy * 2) * rndm.nextDouble() + (yy-rr);
        return pointY;
    }
    
    public boolean insideCircle(double x, double y)
    {
        double c = Math.pow((x-xx),2) - Math.pow((y-yy),2);
        double s = Math.pow(rr,2);
        
        if(c<=s)
        {
            return true;
        }
        else
        {
            return false;
        }

    }
}
