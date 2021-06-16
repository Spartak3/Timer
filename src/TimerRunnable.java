public class TimerRunnable implements Runnable{
    private int minutes;
    private int seconds;

    TimerRunnable(int minute,int seconds){
        this.minutes=minute;
        this.seconds=seconds;
    }
    @Override
    public void run() {
        int min=minutes,sec=seconds;
         StringBuilder text=new StringBuilder();
         while (min!=-1){
             if(min<10)
                 text.append('0');
             text.append(min).append(':');
             if(sec<10)
                 text.append('0').append(sec);
             else
                 text.append(sec);
             System.out.println(text);
             --sec;
             text.setLength(0);
             if(sec==-1) {
                 --min;
                 sec=59;
             }

             try {
                 Thread.sleep(1000);
             } catch (InterruptedException e) {
                 e.printStackTrace();
             }
         }
    }
}
