package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class DisplayContent extends AppCompatActivity {
    ListView lv;
    ArrayList<tayah> Results;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_content);
        Intent i=getIntent();
        String values=i.getStringExtra("Search");
        String Input=i.getStringExtra("Input");
        DbHelper db= new DbHelper(this);
        Results=new ArrayList<tayah>();
        switch (values){
            
            case "ByParaNo":
                Results=db.SearchByParaNo(Input);

                break;

            case "BySurahNo":
                Results=db.getSurah(Integer.parseInt(Input));
                break;
            case "search":
                Results = db.Search(Input);
                break;
        }


        if(Results != null) {
            CustomizedAdapter cA = new CustomizedAdapter(this, Results);

            lv = findViewById(R.id.SearchingPannel);
            lv.setAdapter(cA);
        }
        if(Results == null)
        {
            Toast.makeText(this, "No results found.", Toast.LENGTH_SHORT).show();
        }

    }
}