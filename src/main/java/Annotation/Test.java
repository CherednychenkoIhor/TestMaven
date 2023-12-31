package Annotation;

public class Test {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();

        System.out.println("Hello from main thread");

        MyClass myClass = new MyClass();
        myClass.myMethod();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello from MyThread");
    }
}

class MyClass {
    @Deprecated
    public void myMethod() {
        System.out.println("Hello myMethod");
    }
}
