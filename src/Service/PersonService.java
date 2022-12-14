package Service;

import Classes.PersonClasses.Person;

import java.util.List;

public interface PersonService {
    String createPerson(List<Person>people);
    List<Person> allPerson();
    String searchPersonName(List<Person>people);

}
