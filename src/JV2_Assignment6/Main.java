package JV2_Assignment6;

import java.sql.*;
import java.util.Scanner;

public class Main {

    public static final int ACTIVE = 1;
    public static final int DEACTIVE = 0;

    public static void main(String args[]){
        try {
            Connector connector = new Connector();
            boolean start =  true;
            Scanner scanner = new Scanner(System.in);
            while (start){
                System.out.println("Nhap vao lua chon:");
                System.out.println("1. Login");
                System.out.println("2. Register");
                System.out.println("3. Listing");
                System.out.println("4. Delete");
                System.out.println("5. Exit");

                int menu = scanner.hasNextInt()?scanner.nextInt():0;
                switch (menu){
                    case 1: login(connector); break;
                    case 2: register(connector);break;
                    case 3: break;
                    case 4: break;
                    case 5: start= false;connector.close();break;
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void login(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap password:");
        String password =  scanner.nextLine();

        String sql = "SELECT * FROM user WHERE password LIKE '"+password
                + "' AND username LIKE '"+username+"'";
        ResultSet rs = connector.getQuery(sql);
        if(rs.next()){
            System.out.println("Dang nhap thanh cong");
            return;
        }
        System.out.println("Sai username hoac password.");
    }

    public static void register(Connector connector) throws Exception{
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap username:");
        String username = scanner.nextLine();
        System.out.println("Nhap email:");
        String email = scanner.nextLine();
        System.out.println("Nhap password:");
        String password =  scanner.nextLine();

        String sql = "INSERT INTO user(username,email,password,status) VALUES('"+username+"','"+
                email+"','"+password+"',"+ACTIVE+")";
        if(connector.updateQuery(sql)>0){
            System.out.println("Dang ky thanh cong");
            return;
        }
        System.out.println("Chua tao duoc tai khoan");
    }

}
