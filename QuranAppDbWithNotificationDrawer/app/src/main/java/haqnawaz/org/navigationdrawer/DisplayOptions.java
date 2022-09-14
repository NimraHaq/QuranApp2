package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class DisplayOptions extends AppCompatActivity {
ListView listview;
TextView tv;
ArrayList<String> data;
ArrayAdapter<String> arrayAdapter;
String byPara;
String bySurah;
DbHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_options);
        tv= findViewById(R.id.textView);
        listview = findViewById(R.id.listView2);
        Intent intent3= new Intent(DisplayOptions.this, DisplayContent.class);
        Intent i=getIntent();
        String values=i.getStringExtra("Search");
        byPara = "ByParaNo";
        bySurah = "BySurahNo";
//        tv.setText(values);
        //data = new ArrayList<String>();
        db = new DbHelper(this);
        if(values.equals(byPara))
        {

            Intent intent7 = new Intent(DisplayOptions.this, ListNavigation.class);
            startActivity(intent7);
//            tv.setText("Para Wise Translation");
//
//            data = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
//                    "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"));
//            arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);
//            listview.setAdapter(arrayAdapter);
//            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                Intent intent = new Intent(DisplayOptions.this, DisplayContent.class);
//                @Override
//                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                    Toast.makeText(DisplayOptions.this, "clicked on " + data.get(i), Toast.LENGTH_SHORT).show();
//
//                    intent.putExtra("Search", "ByParaNo");
//                    intent.putExtra("Input", data.get(i));
//                    startActivity(intent);
//                }
//            });

        }
        else if(values.equals(bySurah))
        {
            tv.setText("Surah Wise Translation");
            data = db.getAllSurah();
            arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,data);
            listview.setAdapter(arrayAdapter);
            listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                Intent intent = new Intent(DisplayOptions.this, SurahDetails.class);
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    Toast.makeText(DisplayOptions.this, "clicked on " + Integer.toString(i+1), Toast.LENGTH_SHORT).show();

                    intent.putExtra("surahId", i + 1);
                    startActivity(intent);
                }
            });
        }


        //creating array adopter

    }
}