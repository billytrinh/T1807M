package Session6;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Main {
    public static void main(String args[]) throws  ArithmeticException{

        int x = 0;
        int y = 0;
//        x++;
//        if(y == 0) throw new ArithmeticException("Loi tinh toan");
//        int z = x/y;
//        z++;
        try {
            x++;
            int z = x/y;
            z++;
        }catch (ArithmeticException e){
            System.out.println("Loi tinh toan");
      //  }catch (ClassNotFoundException e){

        //}catch (FileNotFoundException e){

      //  }catch (SQLException e){

        //}catch (IOException e){

        }catch (Exception e){
            System.out.println("Errors");
        }finally {
            System.out.println("xong try catch");
            int z = 0;
        }

        System.out.println("Ket thuc chuong trinh");



//        Asian asian = new Asian();
//
//        //Human human = new Human();
//        //Man man = new Man();
//
//        Asian.Asian2 asian2 = new Asian.Asian2();
//        asian2.showName();
//
//
//        Asian.Asian3 asian3 = new Asian().new Asian3();
//        asian3.showName();
    }
}
