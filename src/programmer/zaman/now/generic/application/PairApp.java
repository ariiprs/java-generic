package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;
import programmer.zaman.now.generic.Pair;

public class PairApp {

    public static void main(String[] args) {

        Pair<String, String> pair = new Pair<>("Eko", "Kurniawan");

        String firstValue = pair.getFirst();
        String secondValue = pair.getSecond();
        String bothValue = pair.getBoth();

        System.out.println(firstValue);
        System.out.println(secondValue);
        System.out.println(bothValue);



    }
}
