package Session6;

public class Asian extends Human implements Man{

    static class Asian2{
        public void showName(){
            System.out.println("Asian 2");
        }
    }

    class Asian3{
        public void showName(){
            System.out.println("Asian 3");
        }
    }

    @Override
    public void run() {

    }

    public void jump(){

    }

    public int checkAge(int age){return age;};

}
