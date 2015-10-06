package c.mars.dagger;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;

import timber.log.Timber;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Timber.plant(new Timber.DebugTree());

        Construction construction = new Construction();
        Facade facade=new Facade("facade");
        ItemsList itemsList = new ItemsList();
        itemsList.set(new Item[]{new Item(1, "a"), new Item(2, "b"), new Item(3, "c")});

        construction.setFacade(facade);
        construction.setItemsList(itemsList);

        Timber.d(itemsList.toString());
        Timber.d(construction.toString());

    }
}
