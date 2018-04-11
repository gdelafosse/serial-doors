package ch.serial.doors;

public class Door5 {

    private int count = 0;

    void inc() {
        count ++;
    }

    int count() {
        return count;
    }

    public static class Door5Runnable implements Runnable {
        private Door5 door5;
        private int count;

        Door5Runnable(Door5 door5, int count) {
            this.door5 = door5;
            this.count = count;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < count; i++) {
                    door5.inc();
                    Thread.sleep(10);
                }
            } catch (InterruptedException e) {
                System.out.println(String.format("%s interrupted at %d", Thread.currentThread().getName(), door5.count()));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Door5 door5 = new Door5();

        Thread thread1 = new Thread(new Door5Runnable(door5, 100));
        thread1.start();

        Thread thread2 = new Thread(new Door5Runnable(door5, 200));
        thread2.start();

        thread1.join(60000);
        thread2.join(60000);

        System.out.println(door5.count);
    }
}
