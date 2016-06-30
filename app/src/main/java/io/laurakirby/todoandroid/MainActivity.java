package io.laurakirby.todoandroid;

import java.util.ArrayList;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView toDoItemsView;
    ListCustomAdapter listItemAdapter;
    ArrayList<ListItem> listItemArray = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listItemArray.add(new ListItem("Birthday", "Buy mom a present"));
        listItemArray.add(new ListItem("Weekend", "Wash car"));

        // add items to adapter
        listItemAdapter = new ListCustomAdapter(MainActivity.this, R.layout.row,
                listItemArray);
        toDoItemsView = (ListView) findViewById(R.id.listView);
        toDoItemsView.setItemsCanFocus(false);
        toDoItemsView.setAdapter(listItemAdapter);
    }
}