
public class Mom implements Runnable {

	@Override
	public void run() {
		Thread ct = Thread.currentThread();
		
		while(true){
			try {
				Thread.sleep(3000);
				System.out.println("Mom?");
		}catch (InterruptedException e){
			break;
		}
			
		}
		System.out.println("User paused timer - Mom Stops");
			

	}

}