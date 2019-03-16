package Session5;

public class Human {

    public String name;
    public Integer age;

    public Human(){
        System.out.println("day la class Human");
    }

    public Human(String name,Integer age){
        this.name = name;
        this.age = age;
    }

    public void run(){
        System.out.println("Running ...");
    }


}
