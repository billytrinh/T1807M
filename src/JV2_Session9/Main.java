package JV2_Session9;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Main {

    public static void main(String args[]){
        // khi mo app va chon ngon ngu
        Locale locale = new Locale("vi","VN");
        Locale.setDefault(locale);

        // khi su dung cac message
        ResourceBundle rB = ResourceBundle.getBundle("JV2_Session9.message");
        System.out.println(rB.getString("hello"));
        System.out.println(rB.getString("goodbye"));

        double money = 12500.15;

        NumberFormat numberFormat = NumberFormat.getCurrencyInstance();
        System.out.println("So tien: "+numberFormat.format(money));

        double x  = 1643333.66;
        NumberFormat number = NumberFormat.getNumberInstance();

        String abc = number.format(x);
        System.out.println(number.format(x));

    }

}
