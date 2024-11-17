package programmer.zaman.now.generic.application;

import programmer.zaman.now.generic.util.Person;

import java.util.Arrays;

public class ComparableApp {

    public static void main(String[] args) {

        Person[] people = {
                new Person("Eko", "Jakarta"),
                new Person("Budi", "Jakarta"),
                new Person("Joko", "Jakarta")
        };

        Arrays.sort(people);

        System.out.println(Arrays.toString(people) );
    }
}
