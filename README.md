# CountInterrupted
Using the handout from class create a counter application which will loop until the user presses the Enter key. Your program will consist of a Main class that contains the main method. The main method will spawn a Thread for the counter and start the counter.

There will also be another class, Counter, that implements Runnable. It will override the run method. The counter class will run as long as the thread is not interrupted.It will print out hte current thread's name and count then sleep for one second.

If the thread is interrupted while it is sleeping, the InterruptedException will be thrown.

Modify the counter application you just created to slowly (every two to four seconds) count to 10,000. Add another thread that interrupts every two seconds to say Mom?

