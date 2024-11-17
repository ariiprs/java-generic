package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.util.ArrayHelper;

public class ArrayHelperApp {

    public static void main(String[] args) {
        String[] names = {"Arie","Prasetyo","Keren"};
        Integer[] numbers = {1,2,3,4,5};

        int lengthName = ArrayHelper.count(names);
        int lengthNumber = ArrayHelper.count(numbers);

        System.out.println(lengthName);
        System.out.println(lengthNumber);
    }
}
