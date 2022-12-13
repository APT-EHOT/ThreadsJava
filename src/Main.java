import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Создание нового потока
        Thread thread = new Thread() {
            public void run() {
                asyncOperation();
            }
        };
        thread.start(); // Запуск нового потока
        System.out.println("Main thread");
    }

    // Ресурсозависимая долгая операция
    static void asyncOperation() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Async operation successful");
    }
}
