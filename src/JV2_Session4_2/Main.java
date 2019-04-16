package JV2_Session4_2;

public class Main {
    public static void main(String args[]){
//        Customer customer = new Customer();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                customer.rutTien(20000);
//            }
//        }).start();
//
//        new Thread(new Runnable() {
//            @Override
//            public void run() {
//                customer.napTien(40000);
//            }
//        }).start();
        SoNguyenTo x = new SoNguyenTo();

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i =0;i<10;i++){
                    try {
                        x.printNextSNT();
                        Thread.sleep(1000);
                    }catch (Exception E){}
                }
            }
        };

        new Thread(runnable).start();
        new Thread(runnable).start();


    }
}
