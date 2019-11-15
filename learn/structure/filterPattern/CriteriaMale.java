package learn.structure.filterPattern;

import java.util.ArrayList;
import java.util.List;

public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        ArrayList<Person> malePersons = new ArrayList<>();
        persons.stream()
                .filter(person -> person.getGender().equalsIgnoreCase("MALE"))
                .forEach(person -> malePersons.add(person));
        return malePersons;
    }
}
