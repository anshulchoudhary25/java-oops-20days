class MyThread implements Runnable {
    public void run(){
        int n = 10;
        for (int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":" + n*i );
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {

        Thread t1 = new Thread(new MyThread());
        Thread t2 = new Thread(new MyThread());

        t1.start();
        t2.start();
    }
}
