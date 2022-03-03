public class thread extends Thread
{
 	public void run()
 	{
  		System.out.println("concurrent thread started running..");
}
 	public static void main( String args[] )
 	{
  		thread mt = new  thread();
  		mt.start();
 	}
}

