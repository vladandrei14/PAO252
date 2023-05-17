import java.util.concurrent.atomic.AtomicInteger;

public class MyThread1 implements Runnable{

    AtomicInteger c;

    public MyThread1(AtomicInteger c){
        this.c = c;
    }

    @Override
    public void run() {
        for(int i=0; i< 1000000; i++){
            c.getAndAdd(1);
        }
    }
}
