class Counter{
    int count = 0;

    public synchronized void increment_count(){
        count++ ;
    }

    public synchronized void decrement_count(){
        count-- ;
    }

    int getcount(){
        return count;
    }
}

class increment extends Thread{
    Counter c;

    increment(Counter c){
        this.c = c;
    }

    public void run(){
        for (int i = 0; i < 100; i++) {
            c.increment_count();
        }
    }
}

class decrement extends Thread{
    Counter c;

    decrement(Counter c){
        this.c = c;
    }
    
    public void run(){
        for (int i = 0; i < 100; i++) {
            c.decrement_count();
        }
    }
}

public class SynchronizedThread {
    public static void main(String[] args) throws InterruptedException {
        Counter c =  new Counter();

        increment i = new increment(c);
        decrement d = new decrement(c);

        i.start();
        d.start();

        i.join();
        d.join();

        System.out.println("Final Counter value : "+ c.getcount());
    }    
}
