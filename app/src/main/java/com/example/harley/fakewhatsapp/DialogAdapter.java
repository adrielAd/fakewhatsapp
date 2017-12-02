package com.example.harley.fakewhatsapp;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class DialogAdapter extends BaseAdapter{
    private Context         context;
    private List<ListDialog>    list;

    public DialogAdapter(Context context, List<ListDialog> list) {
        this.context = context;
        this.list = list;
    }

    public int getCount     ()                                                  {return list.size();}
    public Object getItem   (int position)                                      {return null;}
    public long getItemId   (int position)                                      {return 0;}

    public View getView     (int position, View convertView, ViewGroup parent)  {
        View v = LayoutInflater.from(context).inflate(R.layout.list_layout, parent, false);

        final ListDialog sample = list.get(position);

        ImageView image = (ImageView)v.findViewById(R.id.imgIcon);
        image.setImageResource(sample.getImageID());

        TextView title = (TextView)v.findViewById(R.id.txtTitle);
        title.setText(sample.getTitle());

        TextView desc = (TextView)v.findViewById(R.id.txtDesc);
        desc.setText(sample.getDescription());

        return v;
    }




}
