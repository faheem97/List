package com.mohdfaheemkhan.list;


import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Typeface;
import android.support.annotation.DrawableRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomAdapter extends ArrayAdapter {

    int images[];
    String[] characteristic;
    String[] comment;
    TextView displayComment;
   //AssetManager am = getContext().getApplicationContext().getAssets();
   // Typeface custom_font = Typeface.createFromAsset(am, "fonts/angelina.ttf");

    public CustomAdapter(@NonNull Context context, String[] cars,int images[], String[] characteristic, String[] comment) {
        super(context, R.layout.cars_display, cars);
        this.images= images;
        this.characteristic= characteristic;
        this.comment= comment;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater myInflater = LayoutInflater.from(getContext());
        View customDisplay = myInflater.inflate(R.layout.cars_display,parent,false);
        if(position<10)
        {
            String car = (String) getItem(position);
            TextView displayText = (TextView) customDisplay.findViewById(R.id.displayText);

            TextView displayCharacteristic = (TextView) customDisplay.findViewById(R.id.Characteristic);
            displayComment = (TextView) customDisplay.findViewById(R.id.comment);
            //displayComment.setTypeface(custom_font);
            ImageView displayImage = (ImageView) customDisplay.findViewById(R.id.displayImage);



            displayText.setText(car);
            displayCharacteristic.setText(this.characteristic[position]);
            displayComment.setText(this.comment[position]);
            displayImage.setImageResource(this.images[position]);
        }
        return customDisplay;
    }
}
