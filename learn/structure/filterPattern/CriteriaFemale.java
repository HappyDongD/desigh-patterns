package learn.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> femalePersons = new ArrayList<>();
        persons.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("FEMALE"))
                .forEach(person -> femalePersons.add(person));
        return femalePersons;
    }
}
