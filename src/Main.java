import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please type minutes");
        int minute,second;
        minute=scanner.nextInt();
        System.out.println("Please type seconds");
        second=scanner.nextInt();
        if(second<0||second>59){
            System.out.println("Wrong seconds");
            return;
        }
        Thread thread=new Thread(new TimerRunnable(minute,second));
        thread.start();

        thread.join();
        System.out.println("--End--");
    }
}
