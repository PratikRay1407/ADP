package Q04;

import java.util.HashSet;

import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("One");

        set.add("Two");

        set.add("Three");

        set.add("One"); // Duplicate element, will not be added

        for (String number : set) {

            System.out.println(number);

        }

    }
}