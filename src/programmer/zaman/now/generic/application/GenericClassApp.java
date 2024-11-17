package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class GenericClassApp {
    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Eko");
        MyData<Integer> integerMyData = new MyData<>(10);

        String stringValue = stringMyData.getData();
        System.out.println(stringValue);

        Integer integerValue = integerMyData.getData();
        System.out.println(integerValue);
    }
}
