package logicalProgram;
import java.util.Scanner;

public class StopWatchProgram {

		public long startTimer=0;
		public long stopTimer=0;
		public long elapsed;
				
		public void start()
		{
         		startTimer=System.currentTimeMillis();
			System.out.println("Start Time is: " +startTimer);
		}
			
		public void stop()
		{
			stopTimer=System.currentTimeMillis();
			System.out.println("Stop Time is: "+stopTimer);
		}
			
		public long getElapsedTime()
		{
			elapsed=stopTimer-startTimer;
			return elapsed;
		}
			
		public static void main(String[] args) throws Exception
			
		{
			StopWatchProgram sw=new StopWatchProgram();
			System.out.println("--------------Stop Watch -----------------");
			
			System.out.print("Press 'S' to Start Time: ");
			Scanner sc1= new Scanner(System.in);
			char ch1 = sc1.next().charAt(0);
			if(ch1 == 'S' || ch1 == 's') {
		        	sw.start();
				}
			else
			{
				System.out.println("Invalid character!!");
				}
				
			System.out.println();
			System.out.print("Press 'T' to Stop Time: ");
			Scanner sc2= new Scanner(System.in);
			char ch2 = sc2.next().charAt(0);
			if(ch2=='T' || ch2=='t') {
         			sw.stop();
				long l=sw.getElapsedTime();
				System.out.println();
				System.out.println("Total Time Elapsed(in millisec) is:"+l);
				System.out.println();
				System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
			}
                        else
			{
				System.out.println("Invalid character!!");
				}
				
		}
}
