public class Threads implements Runnable {
    synchronized public void run(){
        for (int i=0;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"----> running");
        }
        try {
			Thread.sleep(1000); // Blocked state
            System.out.println(Thread.currentThread().getName()+"----> executing");
		} catch (InterruptedException e) {
			e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"----> ending");
    }
    public static void main(String[] args){
        Threads obj=new Threads();
        Thread t1 =new Thread(obj);
        t1.setName("Thread1");
        t1.start();

        Thread t2 =new Thread(obj);
        t2.setName("Thread2");
        t2.start();

        Thread t3 =new Thread(obj);
        t3.setName("Thread3");
        t3.start();

        Thread t4 =new Thread(obj);
        t4.setName("Thread4");
        t4.start();

        
    }
}
