package JV2_Session4_2;

public class SoNguyenTo {
    public int SNT = 2;

    public synchronized void printNextSNT() {
        for (int i= SNT+1;true;i++){
            if(checkSNT(i)){
                System.out.println(Thread.currentThread().getName()+" SNT tiep: "+i);
                SNT = i;
                return;
            }
        }
    }

    public boolean checkSNT(int n){
        for (int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return  true;
    }

}
