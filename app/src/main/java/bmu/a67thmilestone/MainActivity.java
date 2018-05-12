package bmu.a67thmilestone;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {


    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }


    public void OurTeam(View view) {

        Intent intent = new Intent(MainActivity.this, OurTeam.class);
        startActivity(intent);
    }

    public void Events(View view) {

        Intent i = new Intent(this, schedulenew.class);
        startActivity(i);
    }

    public void Schedule(View view) {

        Intent intent = new Intent(this, schedule.class);
        startActivity(intent);
    }

//    public void pronites(View view){
//
//        Intent intent = new Intent(this,pronites.class);
//        startActivity(intent);
//    }

    public void blog(View view) {

        Intent intent = new Intent(this, blog.class);
        startActivity(intent);
    }

    public void noti(View view) {

        Intent intent = new Intent(this, PushNotificationActivity.class);
        startActivity(intent);
    }

    public void fee(View view) {

        Intent intent = new Intent(this, Fee_details.class);
        startActivity(intent);
    }

    public void fav(View view) {
        Intent intent = new Intent(this, NotificationActivity.class);
        startActivity(intent);
    }

    public void maps(View view) {

        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }
public void pro(View view){
        Intent i=new Intent(this,pronites.class);
        startActivity(i);
}
    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {

            Intent intent = new Intent(this, AboutUniversity.class);
            startActivity(intent);
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_facebook) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/67thmilestone/"));
            startActivity(intent);

        } else if (id == R.id.nav_instagram) {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/67thmilestone/"));
            startActivity(intent);

        } else if (id == R.id.nav_twitter) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.twitter.com/67th_milestone/")));

        } else if (id == R.id.nav_about) {
            startActivity(new Intent(this, AboutUniversity.class));

        } else if (id == R.id.nav_sponsors) {

            startActivity(new Intent(this, current_sponsors.class));

        } else if (id == R.id.nav_festdetails) {
            startActivity(new Intent(this, aboutthe_fest.class));

        } else if (id == R.id.nav_disclaimer) {
            startActivity(new Intent(this, disclaimer.class));

        } else if (id == R.id.nav_developers) {

            startActivity(new Intent(this, Developers.class));
        } else if (id == R.id.nav_mentors) {

            startActivity(new Intent(this, mentors.class));

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onResume() {
        super.onResume();

        try {
            DatabaseReference databaseReference = FirebaseDatabase.getInstance().getReference().child("notification");
            Query query = databaseReference.orderByPriority();
            query.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    PushNotificationActivity.commentsre.clear();
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {

                        HashMap<String, String> map = new HashMap<>();
                        pushModel data = snapshot.getValue(pushModel.class);

                        assert data != null;
                        map.put("message", data.getMessage());
                        PushNotificationActivity.commentsre.add(map);
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            Log.e(TAG, "onResume: " + e.getMessage());
        }

    }
}
