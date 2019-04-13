package JV2_Session4;

public class Number {
    public int x = 0;
    public int y = 0;
    public int z = 0;

    public synchronized void up(){
        x++;
        y++;
    }

    public synchronized void show(){
        System.out.println("x= "+x);
        System.out.println("y= "+y);
    }

    public void getZ(){
        System.out.println(z);
    }
}
