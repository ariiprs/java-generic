package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.MyData;

public class InvariantApp {

    public static void main(String[] args) {

        MyData<String> stringMyData = new MyData<>("Eko");
        String valueOfStringData = stringMyData.getData();

//        doIt(stringMyData); ini akan error karna invariant pada generic data type tidak dibolehkan
//        MyData<Object> objectMyData = stringMyData; ini juga akan error

        MyData<Object> objectMyData = new MyData<>(1000);
        Object valueOfObjectData = objectMyData.getData();
        System.out.println(valueOfObjectData);
        System.out.println(valueOfStringData);

    }

    public static void doIt(MyData <Object> objectMyData){

    }
}
