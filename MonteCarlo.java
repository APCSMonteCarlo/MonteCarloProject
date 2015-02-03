
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
    public double hh;
    public double kk;
    
    
    public MonteCarlo(double h, double k, double r)
    {
        rr = r;
        hh = h;
        kk = k;
    }
    
    private Random rndm = new Random();
    
    public double nextRainDrop_x()
    {
       double pointX = (hh-rr) + (rr*2*rndm.nextDouble());
       return pointX;
    }
    
    public double nextRainDrop_y()
    {
        double pointY = (kk-rr) + (rr*2*rndm.nextDouble());
        return pointY;
    }
    
    public boolean insideCircle(double x, double y)
    {
        double c = (Math.pow((x-hh),2)) + (Math.pow((y-kk),2));
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
