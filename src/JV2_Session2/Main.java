package JV2_Session2;

public class Main {

    public static void main(String args[]){
        MyGeneric<Integer> myGeneric1 = new
                MyGeneric<>();
        myGeneric1.mark = 100;

        MyGeneric<Double> myGeneric2 = new MyGeneric<>();
        myGeneric2.mark = 7.5;

        MyGeneric2<Integer,MyGeneric<Double>> top =
                new MyGeneric2<>();
        SubGeneric<Integer,Double> subGeneric = new SubGeneric<>();
        subGeneric.key = 111;
        subGeneric.value = 1.223;
    }
}
