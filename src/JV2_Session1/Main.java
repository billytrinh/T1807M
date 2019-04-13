package JV2_Session1;

import org.w3c.dom.Document;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

import java.net.HttpURLConnection;
import javax.xml.parsers.DocumentBuilderFactory;
import java.net.URL;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.StringReader;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;
import org.json.simple.*;
public class Main {

    public static void main(String args[]){
//        HashSet<Integer> randomArray = new HashSet<>();
//        while (randomArray.size()<10){
//            double x = Math.random()*100;
//            x = Math.abs(x);
//            Integer y = (int)x;
//            randomArray.add(y);
//        }
//
//        for (Integer i:randomArray){
//            System.out.println(i);
//        }
//
//        HashMap<String,String> stringHashMap = new HashMap<>();
//
//        stringHashMap.put("name","Nam");
//        stringHashMap.get("name");
//
//        plus(1,3);
//        plus(1.12,5.33);
//        plus("aabbb","ccbbb");
////        Double d = Double.parseDouble(textField.getText());
////        Double d1 = Math.floor(d);
//        randomNumber(3.14);
//        randomNumber(2);
        try {
            //loadTestDocument();
            jsonShow();
        }catch (Exception e){}
    }

    private static void loadTestDocument() throws Exception {
        try {
            String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22";
           // System.out.println(url);
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            int responseCode = con.getResponseCode();
            System.out.println("Response Code : " + responseCode);
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(con.getInputStream()));
            String inputLine;
            String response = new String();
            while ((inputLine = in.readLine()) != null) {
                response +=(inputLine);
            }
            in.close();
           // System.out.println(response);
            //print in String
            // System.out.println(response.toString());
            Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                    .parse(new InputSource(new StringReader(response)));
            NodeList errNodes = doc.getElementsByTagName("current");
            if (errNodes.getLength() > 0) {
                  Element current = (Element)errNodes.item(0);

                    Element city = (Element) current.getElementsByTagName("city").item(0);
                    Element temperature = (Element) current.getElementsByTagName("temperature").item(0);
                    System.out.println(city.getAttribute("name")+" : "+temperature.getAttribute("value"));
           //     System.out.println(city.getTextContent());
//                System.out.println("raw_offset -"+err.getElementsByTagName("city").item(0).getTextContent());
//                System.out.println("dst_offset -"+err.getElementsByTagName("wind").item(0).getTextContent());
            } else {
                // success
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void jsonShow() throws Exception{
        String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22";
        // System.out.println(url);
        URL obj = new URL(url);
        HttpURLConnection con = (HttpURLConnection) obj.openConnection();
        int responseCode = con.getResponseCode();
        System.out.println("Response Code : " + responseCode);
        BufferedReader in = new BufferedReader(
                new InputStreamReader(con.getInputStream()));
        String inputLine;
        String response = new String();
        while ((inputLine = in.readLine()) != null) {
            response +=(inputLine);
        }
        System.out.println(response);
        Object jsonObj = JSONValue.parse(response);
        JSONObject jsonObject = (JSONObject)jsonObj;
        System.out.println(jsonObject.get("coord"));
        JSONObject main = (JSONObject)jsonObject.get("main");
        System.out.println(main.get("temp"));
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
