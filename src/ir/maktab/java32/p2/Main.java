package ir.maktab.java32.p2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(25, "ali", "piry",
                        new Address("modiri", "molavi", 12, "tehran", 176673748)
                )
        );
        persons.add(new Person(20, "asgar", "asgari",
                        new Address("rezvani", "shahpor", 8, "tehran", 187475566)
                )
        );
        persons.add(new Person(24, "bagher", "bageri",
                        new Address("sheydaei", "moniriye", 4, "gazvin", 17524669)
                )
        );
        System.out.println();
        System.out.println(persons);
        System.out.println("*********************************************************\nsort by age");
        Collections.sort(persons);
        System.out.println(persons);
        System.out.println("*********************************************************\nsort by last name");
        Person.CompareByLastName compareByLastName = new Person.CompareByLastName();
        Collections.sort(persons, compareByLastName);
        System.out.println(persons);
        System.out.println("*********************************************************\nsort by city an zone");
        List<Person> tehranZone = persons.stream().filter(p -> p.address.city != "tehtan").filter(p -> p.address.zone < 5).collect(Collectors.toList());
        System.out.println(tehranZone);
    }// end of method main
}
