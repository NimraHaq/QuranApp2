package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SurahDetails extends AppCompatActivity {

    DbHelper db;
    TextView ID, nameEng, nameURdu, Intro;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_surah_details);
        Intent intent = getIntent();
        db = new DbHelper(this);
        int surahId = intent.getIntExtra("surahId", 1);
        SurahDetailsClass details = db.getSurahDetailsById(surahId);
        ID = findViewById(R.id.surahID);
        nameEng = findViewById(R.id.surahNameEng);
        nameURdu = findViewById(R.id.surahNameUrdu);
        Intro = findViewById(R.id.surahIntro);
        btn=findViewById(R.id.readSurah);
        Intro.setMovementMethod(new ScrollingMovementMethod());

        ID.setText(Integer.toString(details.getSurahID()));
        nameEng.setText(details.getSurahNameEng());
        nameURdu.setText(details.getSurahNameUrdu());
        Intro.setText(details.getSurahIntro());

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //when button is clicked
                Intent intent2 = new Intent(SurahDetails.this, DisplayContent.class);
                intent2.putExtra("Search", "BySurahNo");
                intent2.putExtra("Input", Integer.toString(details.getSurahID()));
                startActivity(intent2);
            }
        });

    }
}