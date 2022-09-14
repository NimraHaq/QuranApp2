package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;

public class ListNavigation extends AppCompatActivity {

    RecyclerView recyclerView;
    RecyclerViewAdaptor recyclerViewAdaptor;
    ArrayList<String> ParaNumber;
    ArrayAdapter<Integer> arrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_navigation);
        Toast.makeText(this, "this is class navigation list" , Toast.LENGTH_SHORT).show();

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ParaNumber = new ArrayList<String>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
                "21", "22", "23", "24", "25", "26", "27", "28", "29", "30"));

            Toast.makeText(this, "this is para " , Toast.LENGTH_SHORT).show();
            recyclerViewAdaptor = new RecyclerViewAdaptor(this,ParaNumber);
            recyclerView.setAdapter(recyclerViewAdaptor);


    }
}