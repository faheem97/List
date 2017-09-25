package com.mohdfaheemkhan.list;

//import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
//import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
//import android.widget.ArrayAdapter;
//import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] cars = {"Audi", "Ferari", "Bentley", "Lamborghini", "Porche", "Jaguar", "BMW", "Mercedes","Hyundai"};
        String[] characteristic = {"Stylish", "Fast", "Big", "Costly", "Prized", "Luxurious", "Renowned", "Elegant", "Affordable"};
        String[] comments = {"High Maintenance", "More Fuel Consumption", "Slow", "Less Demand", "Increased Demand", "Improved Look and Feel", "Widely Famous", "Rich look", "Popular"};
        int images[] = {R.drawable.big_icon1,R.drawable.big_icon2,R.drawable.big_icon3,R.drawable.big_icon4,R.drawable.big_icon5,R.drawable.big_icon6,R.drawable.big_icon7,R.drawable.big_icon8,R.drawable.big_icon9};

        ListAdapter arrayToList = new CustomAdapter(this, cars,images,characteristic,comments);
        ListView myList = (ListView) findViewById(R.id.myList);
        myList.setAdapter(arrayToList);

        myList.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                        String car = String.valueOf(adapterView.getItemAtPosition(i));
                        Toast.makeText(MainActivity.this,car,Toast.LENGTH_LONG).show();
                    }
                }
        );

    }
}
