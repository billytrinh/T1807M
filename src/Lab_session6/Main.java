package Lab_session6;

public class Main {
    public static void main(String args[]){
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.insertPhone("Le van A","09888999");
        phoneBook.insertPhone("Le van A","098889998");
        for (PhoneNumber pN:phoneBook.PhoneList){
            System.out.println(pN.getName()+":" +pN.getPhone());
        }
        FuncInterface func = new FuncInterface() {
            @Override
            public void sayHello() {
                System.out.println("Hello ..");
            }
        };
        func.sayHello();
    }
}
