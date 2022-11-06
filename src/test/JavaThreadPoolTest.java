package test;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class JavaThreadPoolTest {
    public static void main(String[] args) {
        ExecutorService invoker = Executors.newFixedThreadPool(2);
        invoker.execute(new TestCommand());
    }

    public static class TestCommand implements Runnable {

        @Override
        public void run() {
            System.out.println("test");
        }
    }
}