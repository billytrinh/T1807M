package JV2_Session4_2;

public class Customer {

    public int money = 10000;

    public synchronized void rutTien(int n){
        if(n > money){
            System.out.println("Khong the rut "+n);
            try{
                System.out.println("Cho bo gui tien...");
                wait();
            }catch (Exception e){}
        }
        money -= n;
        System.out.println("Da rut so tien: "+n);
    }

    public synchronized void napTien(int n){
        money +=n;
        System.out.println("Nap tien thanh cong: "+n);
        try{
            notify();
            //notifyAll();
        }catch (Exception E){}
    }
}
