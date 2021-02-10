package concurrency.Demo;

class main {
    public static void main(String[] args) throws InterruptedException {

        try{
            System.out.println("Run!");
            Thread.sleep(4500);
            System.out.println("Run again!");
        }catch (InterruptedException e){
            e.printStackTrace();
        }



        ThreadDemo threadDemo = new ThreadDemo();
        threadDemo.start();
        System.out.println("ThreadDemo thread executed!");



        System.out.println();
    }
}