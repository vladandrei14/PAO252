import java.util.concurrent.atomic.AtomicInteger;

public class MyThread2 extends Thread {

    AtomicInteger c;

    public MyThread2(AtomicInteger c){
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i< 1000000; i++){
            c.getAndAdd(1);
        }
    }
}
