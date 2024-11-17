package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class ContraVariantApp {
    public static void main(String[] args) {
        MyData<Object> objectMyData = new MyData<>("Eko");

        MyData<? super String> myData = objectMyData;
        process(objectMyData);

        System.out.println(myData.getData());

    }

    public static void process (MyData<? super String> myData){
        String value = (String) myData.getData();
        System.out.println("Process parameter " + value);

        myData.setData("Eko");

    }
}
