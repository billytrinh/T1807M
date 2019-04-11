package JV2_Session3;

public class MyThread implements Runnable{

    public void run(){
        for (int i=0;i<1000;i++){
            try {
                System.out.println("My Thread: "+i);
                Thread.sleep(1000);
            }catch (Exception e){}

        }
    }
}
