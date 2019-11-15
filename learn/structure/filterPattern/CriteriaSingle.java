package learn.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaSingle implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> singlePersons = new ArrayList<>();
        persons.stream()
                .filter(person -> person.getMaritalStatus().equalsIgnoreCase("SINGLE"))
                .forEach(person -> singlePersons.add(person));
        return singlePersons;
    }
}
