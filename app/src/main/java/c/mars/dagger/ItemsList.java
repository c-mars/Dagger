package c.mars.dagger;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

/**
 * Created by mars on 10/6/15.
 */
@Data
public class ItemsList {
    private List<Item> items = new ArrayList<>();

    public void set(Item[] arr) {
        items.clear();
        for(Item item:arr) items.add(item);
    }
}
