package c.mars.dagger;

import lombok.Data;
import lombok.RequiredArgsConstructor;

/**
 * Created by mars on 10/6/15.
 */
@Data @RequiredArgsConstructor
public class Item {
    final private int id;
    final private String name;
}
