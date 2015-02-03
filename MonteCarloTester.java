
/**
 * MonteCarloTester
 * 
 * @author (Schmeltzer, Rachel) 
 * @version (v.I 30 Jan 2015)
 */
public class MonteCarloTester
{
   
    
   public static void main(String[] args)
   {
       MonteCarlo mcObj = new MonteCarlo(5,3,2);
       double cirCount = 0;
       double sqrCount = 0;
       for(int a = 0; a<100000000; a++)
       {
           double x = mcObj.nextRainDrop_x();
           double y = mcObj.nextRainDrop_y();
           
           if(mcObj.insideCircle(x,y))
           {
               cirCount++;
           }
           sqrCount++;
       }
       double s = (cirCount*Math.pow((2*mcObj.rr),2))/(sqrCount*Math.pow((mcObj.rr),2));
               
       System.out.println("The estimate of Pi is " + s);
   }
}
