package weathermap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;

import java.io.BufferedReader;
import java.io.InputStreamReader;
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
}
