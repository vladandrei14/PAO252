import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

    static Counter counter = new Counter();

    static AtomicInteger number = new AtomicInteger(0);

    List<String> lista = new CopyOnWriteArrayList<>();
    Map<String, String> map = new ConcurrentHashMap<>();

    Set<String> set = new ConcurrentSkipListSet<>();

    public static void main(String[] args) throws InterruptedException {


        MyThread1 t1 = new MyThread1(number);
        MyThread2 t2 = new MyThread2(number);

        Thread t3 = new Thread(t1);

//        contextul threadului current -- main thread
//        Thread currentThread = Thread.currentThread();
//        t1.run();
//        t2.run();

//        t3.start();
//        t2.start();
//
//        t3.join();
//        t2.join();

        ExecutorService es = Executors.newFixedThreadPool(2);

        es.submit(t3);
        es.submit(t2);

        es.shutdown();

        es.awaitTermination(20, TimeUnit.MINUTES);

        System.out.println(number);
    }
}