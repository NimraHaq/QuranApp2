package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Search extends AppCompatActivity {

    EditText keywordEntered;
    Button searchButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        keywordEntered = findViewById(R.id.keyword);
        searchButton = findViewById(R.id.searchbutton);

        searchButton.setOnClickListener(new View.OnClickListener() {
            Intent intent = new Intent(Search.this, DisplayContent.class);
            @Override
            public void onClick(View view) {
                //Toast.makeText(Search.this, keywordEntered.getText(), Toast.LENGTH_SHORT).show();
                intent.putExtra("Search", "search");
                intent.putExtra("Input", keywordEntered.getText());
                startActivity(intent);
            }
        });
    }
}