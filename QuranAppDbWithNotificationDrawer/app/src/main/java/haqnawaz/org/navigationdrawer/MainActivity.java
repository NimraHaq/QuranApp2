package haqnawaz.org.navigationdrawer;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {

    NavigationView navigationView;
    DrawerLayout drawerLayout;
    Toolbar toolbar;
    ActionBarDrawerToggle toggle;

    @Override
    public void onBackPressed(){
        if(drawerLayout.isDrawerOpen(GravityCompat.START)){
            drawerLayout.closeDrawer(GravityCompat.START);
            Toast.makeText(getApplicationContext(),"Start",Toast.LENGTH_LONG).show();

        }
        else
        {
            Toast.makeText(getApplicationContext(),"End",Toast.LENGTH_LONG).show();
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbHelper d= new DbHelper(MainActivity.this);

        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        navigationView=findViewById(R.id.nav_view);
        drawerLayout=findViewById(R.id.drawer);

        toggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.open,R.string.close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem)
            {
                switch (menuItem.getItemId())
                {

                    case R.id.nav_SearchByParaNo:
                        Toast.makeText(getApplicationContext(),"para wise",Toast.LENGTH_LONG).show();
                        Intent intent3 = new Intent(MainActivity.this, DisplayOptions.class);
                        intent3.putExtra("Search","ByParaNo");
                        startActivity(intent3);
                        //Toast.makeText(getApplicationContext(), "this is para i " , Toast.LENGTH_SHORT).show();

                        /*Intent intent8 = new Intent(MainActivity.this, ListNavigation.class);
                        intent8.putExtra("load", "para");
                        startActivity(intent8);*/
                        break;

                    case R.id.nav_SearchBySurahNo:
                        Toast.makeText(getApplicationContext(),"surah wise",Toast.LENGTH_LONG).show();
                        Intent intent5 = new Intent(MainActivity.this, DisplayOptions.class);
                        intent5.putExtra("Search","BySurahNo");
                        startActivity(intent5);
                        //Toast.makeText(getApplicationContext(), "this is surah i " , Toast.LENGTH_SHORT).show();

                        /*Intent intent9 = new Intent(MainActivity.this, ListNavigation.class);
                        intent9.putExtra("load", "surah");
                        startActivity(intent9);*/
                        break;
                    case R.id.nav_search:
                        Toast.makeText(getApplicationContext(),"Search by keyword",Toast.LENGTH_LONG).show();
                        Intent intent6 = new Intent(MainActivity.this, Search.class);
                        startActivity(intent6);
                        break;

                }

                return true;
            }
        });

    }
}