package weathermap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

import javax.xml.parsers.DocumentBuilderFactory;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Main {

    public static void main(String args[]) throws Exception{
        // Ket noi va lay du lieu tu api
        String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&appid=b6907d289e10d714a6e88b30761fae22";

        URL obj = new URL(url);
        HttpURLConnection conn = (HttpURLConnection)obj.openConnection();
//        int responseCode = conn.getResponseCode();
//        System.out.println(responseCode);
        BufferedReader in = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        String inputLine;
        String response = "";
        while ((inputLine = in.readLine()) != null){
            response += inputLine;
        }
        //System.out.println(response);

        // end


        // Read json data
        Object dataObj  = JSONValue.parse(response);
        JSONObject jsonObject = (JSONObject)dataObj;

        JSONObject main = (JSONObject)jsonObject.get("main");

        JSONArray weather = (JSONArray)jsonObject.get("weather");
        //System.out.println(weather.size());
        JSONObject weather_first = (JSONObject)weather.get(0);

        JSONObject coord = (JSONObject)jsonObject.get("coord");

        System.out.println(jsonObject.get("name")+" : "+main.get("temp"));
        System.out.println("Min : "+main.get("temp_min"));
        System.out.println("Max : "+main.get("temp_max"));
        System.out.println("Desc: "+weather_first.get("description"));
        System.out.println("Lat: "+coord.get("lat"));
        System.out.println("Long: "+coord.get("lon"));
    }


    public static void mainWithXML(String args[]) throws Exception{
        String url = "https://samples.openweathermap.org/data/2.5/weather?q=London&mode=xml&appid=b6907d289e10d714a6e88b30761fae22";
        URL objUrl = new URL(url);
        HttpURLConnection conn = (HttpURLConnection)objUrl.openConnection();
        System.out.println("Response code: "+conn.getResponseCode());
        BufferedReader bufferedReader = new BufferedReader(
                new InputStreamReader(conn.getInputStream()));
        String response = new String();
        String inputLine;
        while ((inputLine = bufferedReader.readLine()) != null){
            response += inputLine;
        }
        //System.out.println(response);
        Document doc = DocumentBuilderFactory.newInstance().newDocumentBuilder()
                .parse(new InputSource(new StringReader(response)));
        NodeList nodeList = doc.getElementsByTagName("current");
        if(nodeList.getLength() > 0){
            Element current = (Element) nodeList.item(0);
            Element city = (Element)current.getElementsByTagName("city").item(0);
            System.out.println("City:"+ city.getAttribute("name"));
            Element temp = (Element)current.getElementsByTagName("temperature").item(0);
            System.out.println("Temp: "+temp.getAttribute("value"));
            System.out.println("Min: "+temp.getAttribute("min"));
            System.out.println("Max: "+temp.getAttribute("max"));
        }
    }


    // Day la func xử lý api với method POST
    public static void postAPI() throws Exception{
        String POST_URL = "http://s07e.fptaptechcompetition.com/api/postAPI";
        URL objUrl = new URL(POST_URL);
        HttpURLConnection conn = (HttpURLConnection)objUrl.openConnection();

        // ONLY POST METHOD
        conn.setRequestMethod("POST");
        // POST WITH PARAMS
        String PARAMS = "city=Hanoi&temp=22";
        conn.setDoOutput(true);
        OutputStream outputStream = conn.getOutputStream();
        outputStream.write(PARAMS.getBytes());
        outputStream.flush();
        outputStream.close();
        // END

        System.out.println(conn.getResponseCode());
    }
}
