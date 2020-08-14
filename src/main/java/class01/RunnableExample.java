package class01;

public class RunnableExample {

    public static void main(String[] args) {

        // Before
        Runnable r1 = new Runnable() {
            public void run() {
                System.out.println("runnable-1");
            }
        };
        new Thread(r1).start();

        // After
        Runnable r2 = () -> System.out.println("runnable-2");
        new Thread(r2).start();

        Runnable r3 = () -> {
            System.out.println("runnable-3");
            System.out.println("runnable-3.2");
        };
        new Thread(r3).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("thread-1");
            }
        }).start();

        new Thread(() -> {
            System.out.println("thread-2");
            System.out.println("thread-2.1");
        }).start();

    }

}
