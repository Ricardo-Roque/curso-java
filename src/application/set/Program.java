package application.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Program {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("TV");
        set.add("Tablet");
        set.add("Notebook");

        System.out.println(set.contains("Notebook"));

        for (String p : set) {
            System.out.println(p);
        }

        Set<String> set2 = new HashSet<>();

        set2.add("TV");
        set2.add("Tablet");
        set2.add("Notebook");

        System.out.println(set2.contains("Notebook"));

        for (String p : set2) {
            System.out.println(p);
        }

        Set<String> set3 = new HashSet<>();

        set3.add("TV");
        set3.add("Tablet");
        set3.add("Notebook");

        System.out.println(set3.contains("Notebook"));

        for (String p : set3) {
            System.out.println(p);
        }
    }
}
