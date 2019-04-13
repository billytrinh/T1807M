package JV2_Session4;

public class Main {
    public static void main(String args[]){
        Number number = new Number();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
//                synchronized (number){
                    for (int i=0;i<100;i++){
                        System.out.println(Thread.currentThread()
                                .getName());
                        number.up();
                        number.show();
                        try {
                            Thread.sleep(1000);
                        }catch (Exception e){}
                    }
//                }
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();


    }
}
