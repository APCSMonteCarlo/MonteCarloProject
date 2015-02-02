
/**
 * MonteCarloTester
 * 
 * @author (Schmeltzer, Rachel) 
 * @version (v.I 30 Jan 2015)
 */
public class MonteCarloTester
{
   
    
   public static void main(String args[])
   {
       MonteCarlo mcObj = new MonteCarlo(5,3,2);
       double cirCount = 0;
       double sqrCount = 0;
       for(int a = 0; a<100; a++)
       {
           double randX = MonteCarlo.nextRainDrop_x();
           double randY = MonteCarlo.nextRainDrop_y();
           
           if(MonteCarlo.insideCircle(randX, randY))
           {
               cirCount++;
           }
           sqrCount++;
       }
       int s = cirCount*Math.pow((2*MonteCarlo.rr),2)
               / (sqrCount*Math.pow(MonteCarlo.rr,2));
       System.out.println("The estimate of Pi is " + s);
   }
}
