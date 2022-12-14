package Impl;

import Classes.PersonClasses.Person;
import Service.PersonService;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PersonImpl implements PersonService {
    List<Person>personList = new ArrayList<>();
    @Override
    public String createPerson(List<Person>people) {
this.personList.addAll(people);
return "Create Person";
    }

    @Override
    public List<Person> allPerson() {
        return this.personList;
    }

    @Override
    public String searchPersonName(List<Person>people) {
        System.out.println("Write person name : ");
        String name = new Scanner(System.in).nextLine();
        for (Person p:people) {
            if(name.equals(p.getName())){
                System.out.println(p);
            }
        }return "Search Person name !";

    }


}
