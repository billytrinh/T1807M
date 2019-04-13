package JV2_Session3;

public class Main {
    public static void main(String args[]){
        SubThread s1 = new SubThread();
//        s1.setName("thread abc");
//        System.out.println(s1.getName());
        s1.start();
        try {
            s1.join();
        }catch (Exception e){}

        String x = "aaaa";

        MyThread m1 = new MyThread();
        Thread thread =  new Thread(m1);
       // thread.setDaemon(true);
        thread.start();

        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println(x+"chay 1 luong con");
            }
        };
        Thread thread2 =  new Thread(r1);
        thread2.start();

        System.out.println("Main Thread....");
    }
}
