package JV2_Assignment6;

import java.sql.ResultSet;
import java.util.ArrayList;

public class DAOUser implements DAOInterface{

    @Override
    public ArrayList<User> getUsers() {
        String sql = "SELECT * FROM user";
        Connector connector = Connector.getInstance();
        try {
            ResultSet rs = connector.getQuery(sql);
            ArrayList<User> users =  new ArrayList<>();
            while (rs.next()){
                Integer id = rs.getInt("id");
                String username = rs.getString("username");
                String email = rs.getString("email");
                String password = rs.getString("password");
                Integer status = rs.getInt("status");

                User u = new User(id,username,email,password,status);

                users.add(u);
            }
            return  users;
        }catch (Exception e){}

        return null;
    }

    @Override
    public boolean createUser(User user) {
        String sql = "INSERT INTO user(username,email,password,status)" +
                " VALUES('"+user.getUsername()+"','"+user.getEmail()+"','"
                +user.getPassword()+"',1)";
        Connector connector = Connector.getInstance();
        try {
            connector.updateQuery(sql);
            return true;
        }catch (Exception e){}
        return false;
    }

    @Override
    public boolean updateUser(User user) {
        return false;
    }

    @Override
    public boolean deleteUser(User user) {
        return false;
    }
}
