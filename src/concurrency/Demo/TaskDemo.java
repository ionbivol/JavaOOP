package concurrency.Demo;

public class TaskDemo implements Runnable {


    @Override
    public void run() {
        System.out.println("Executed from TaskDemo class!");

    }
}
