package songuyento;

import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    public Text txt;

    public Integer snt = 2;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (Integer i= snt+1;true;i++){
                    if(checkSNT(i)){
                        txt.setText(i.toString());
                        try {
                            Thread.sleep(1000);
                        }catch (Exception e){}
                    }
                }
            }

            public boolean checkSNT(Integer n){
                for (int i=2;i<=n/2;i++){
                    if(n%i==0) return false;
                }
                return  true;
            }
        });
        t.setDaemon(true);
        t.start();
    }

    public void nextSNT(){
        System.out.println(Thread.currentThread().getName());
       Thread t = new Thread(new Runnable() {
           @Override
           public void run() {
               for (Integer i= snt+1;true;i++){
                   if(checkSNT(i)){
                       txt.setText(i.toString());
                       try {
                           Thread.sleep(1000);
                       }catch (Exception e){}
                   }
               }
           }

           public boolean checkSNT(Integer n){
               for (int i=2;i<=n/2;i++){
                   if(n%i==0) return false;
               }
               return  true;
           }
       });
       t.setDaemon(true);
       t.start();
    }
}
