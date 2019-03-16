package Session5;

public class Vietnamese extends Asian{

    public void eat(){
        System.out.println("eating..");
    }

    public void eat(String mon_an){
        System.out.println("eating "+ mon_an+ " ...");
    }

    public void eat(String thuc_don,Integer x){

    }

    public void eat(Integer x,String thuc_don){

    }

    @Override
    public void jump(){
        System.out.println("VN jumnp...");
    }

}
