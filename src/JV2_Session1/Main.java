package JV2_Session1;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Main {

    public static void main(String args[]){
        HashSet<Integer> randomArray = new HashSet<>();
        while (randomArray.size()<10){
            double x = Math.random()*100;
            x = Math.abs(x);
            Integer y = (int)x;
            randomArray.add(y);
        }

        for (Integer i:randomArray){
            System.out.println(i);
        }

        HashMap<String,String> stringHashMap = new HashMap<>();

        stringHashMap.put("name","Nam");
        stringHashMap.get("name");

        plus(1,3);
        plus(1.12,5.33);
        plus("aabbb","ccbbb");
//        Double d = Double.parseDouble(textField.getText());
//        Double d1 = Math.floor(d);
        randomNumber(3.14);
        randomNumber(2);
    }

    public static <N> void plus(N a, N b){
        if(a instanceof Integer){
            System.out.println((Integer)a + (Integer)b);
        }else if(a instanceof Double){
            System.out.println((Double)a + (Double)b);
        }else {
            System.out.println("Khong tinh duoc");
        }
    }

    public static <Z> Z returnX(Z n){
        return n;
    }

    public static <N> void randomNumber(N n){
        Random random = new Random();
        if(n instanceof Integer){
            Integer x = random.nextInt();
            while (x < (Integer)n){
                x = random.nextInt();
            }
            System.out.println("random: "+x);
        }else if(n instanceof Double){
            Double x = random.nextDouble();
            while (x < (Double)n){
                x += random.nextDouble();
            }
            System.out.println("random: "+x);
        }else {
            System.out.println("Khong tim duoc");
        }
    }

 //   Viết 1 method in ra 1 số ngẫu nhiên lớn hơn số n được truyền vào.

// Random  --- Math.random


    /*
        K => key
        V => value
        E => Element
        N => Number
     */


}
