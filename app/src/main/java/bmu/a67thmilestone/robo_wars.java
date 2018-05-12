package bmu.a67thmilestone;

import android.content.Intent;
import android.net.Uri;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;

public class robo_wars extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_robo_wars );


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DocumentView documentView = new DocumentView(this, DocumentView.PLAIN_TEXT);  // Support plain text
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);

        if (getSupportActionBar() != null) {
            getSupportActionBar().setTitle("");
            getSupportActionBar().setHomeButtonEnabled(true);
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        }
        FloatingActionButton favorites_fab = (FloatingActionButton) findViewById(R.id.favorites_fab);
        favorites_fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fdhandler fdh = new fdhandler(getApplicationContext(),null,null,1);
                favouritesdatabase fd = new favouritesdatabase("Robo Wars","6th April | 10:00 am","Badminton Court - Defenders/");
                fdh.addfavouriteevent(fd);
                Toast.makeText(getApplicationContext(),"Event added to your Favourites",Toast.LENGTH_LONG).show();
                // Intent i = new Intent(getApplicationContext(), MyService.class);
                // startService(i);
            }
        });
    }


    public void reg(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.67thmilestone.com/login/"));
        startActivity(intent);

    }

    public void rules(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://67thmilestone.com/download/RoboWars_Robotics/pdf"));
        startActivity(intent);

    }


    public void email1(View v) {
        String[] addresses = {"annaluru.abhilash.16cse@bml.edu.in"};

        String subject = "Fest";
        composeEmail(addresses, subject);
    }

    public void email2(View v) {
        String[] addresses = {"maniteja.vallala.16csc@bml.edu.in"};

        String subject = "Fest";
        composeEmail(addresses, subject);
    }

    public void call1(View v) {
        dialPhoneNumber("8978134349");
    }

    public void call2(View v) {
        dialPhoneNumber("9996685927");
    }


    private void composeEmail(String[] addresses, String subject) {
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setType("*//*");
        intent.setData(Uri.parse("mailto:"));     //only e-mail apps should handle this
        intent.putExtra(Intent.EXTRA_EMAIL, addresses);
        intent.putExtra(Intent.EXTRA_SUBJECT, subject);


        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    public void dialPhoneNumber(String phoneNumber) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + phoneNumber));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
    }
}
