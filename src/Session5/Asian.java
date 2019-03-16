package Session5;

public class Asian extends Human{

    public String country;

    public Asian(){

    }

    public Asian(String name,Integer age,String country){
        super(name,age);
        this.country = country;
    }

    public void jump(){
        super.age = 20;
        this.run();
        System.out.println("Jumping...");
    }

    public void run(){
        super.run();
        System.out.println("Iam Running ...");
    }

    public void eat(int x){
        System.out.println("eating... "+ x);
    }

}
