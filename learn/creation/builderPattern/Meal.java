package learn.creation.builderPattern;

import java.util.ArrayList;
import java.util.List;

public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void addItem(Item item) {
        items.add(item);
    }

    public float getCost(){
        return items.stream()
                .map(Item::price)
                .reduce((Float::sum))
                .orElse(-1f);
    }
}
