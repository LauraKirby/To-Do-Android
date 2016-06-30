package io.laurakirby.todoandroid;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.TextView;

public class ListCustomAdapter extends ArrayAdapter<ListItem> {
    Context context;
    int layoutResourceId;
    ArrayList<ListItem> data = new ArrayList<ListItem>();

    public ListCustomAdapter(Context context, int layoutResourceId,
                             ArrayList<ListItem> data) {
        super(context, layoutResourceId, data);
        this.layoutResourceId = layoutResourceId;
        this.context = context;
        this.data = data;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        ItemHolder itemHolder = null;

        if (row == null) {
            LayoutInflater inflater = ((Activity) context).getLayoutInflater();
            row = inflater.inflate(layoutResourceId, parent, false);
            itemHolder = new ItemHolder();
            itemHolder.textTaskTitle = (TextView) row.findViewById(R.id.textView1);
            itemHolder.textTaskDescription = (TextView) row.findViewById(R.id.textView2);
            itemHolder.btnEdit = (Button) row.findViewById(R.id.buttonEdit);
            itemHolder.btnDelete = (Button) row.findViewById(R.id.buttonDelete);
            row.setTag(itemHolder);
        } else {
            itemHolder = (ItemHolder) row.getTag();
        }
        ListItem item = data.get(position);
        itemHolder.textTaskTitle.setText(item.getTaskTitle());
        itemHolder.textTaskDescription.setText(item.getTaskDescription());

        itemHolder.btnEdit.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("Edit Button", "==========");
            }
        });

        itemHolder.btnDelete.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                Log.i("Delete Button", "==========");
            }
        });
        return row;

    }

    static class ItemHolder {
        TextView textTaskTitle;
        TextView textTaskDescription;
        Button btnEdit;
        Button btnDelete;
    }
}
