class Thread1 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 1 :"+i);
        }
    }
}
class Thread2 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 2 :"+i);
        }
    }
}
class Thread3 extends Thread{
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread 3 :"+i);
        }
    }
}


public class ThreadA {
    public static void main(String[] args) {
        
        Thread t1 =  new Thread(new Thread1());
        Thread t2 =  new Thread(new Thread2());
        Thread t3 =  new Thread(new Thread3());

        t1.start();
        t2.start();
        t3.start();
    }
}
