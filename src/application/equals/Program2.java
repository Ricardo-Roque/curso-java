package application.equals;

import entities.equals_hashcode.Client;

public class Program2 {
    public static void main(String[] args) {

        Client c1 = new Client("Amanda", "amanda@gmail.com");
        Client c2 = new Client("Amanda", "amanda@gmail.com");

        String s1 = "Teste";
        String s2 = "Teste";

        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());
        System.out.println(c1.equals(c2));
        System.out.println(c1 == c2);
        System.out.println(s1 == s2);
    }
}
