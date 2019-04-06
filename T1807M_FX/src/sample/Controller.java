package sample;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;

import java.util.HashSet;

public class Controller {

    public Button btn;
    public TextArea txt;

    public void Submit(){
        HashSet<Integer> randomArray = new HashSet<>();
        while (randomArray.size()<10){
            double x = Math.random()*100;
            x = Math.abs(x);
            Integer y = (int)x;
            randomArray.add(y);
        }
        String str ="";
        for (Integer i:randomArray){
            str += i+"\n";
        }
        txt.setText(str);
    }

}
