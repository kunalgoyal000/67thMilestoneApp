package bmu.a67thmilestone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Developers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);
    }

    public void namanfb(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
        startActivity(intent);
    }
    public void abhilashfb(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/heartbeatswithkratos"));
        startActivity(intent);
    }

    public void kunalyt(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100002536644912"));
        startActivity(intent);
    }

    public void abhayfb(View view){

        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100007446845147"));
        startActivity(intent);
    }

    public void hiteshfb(View view ){

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/")));
    }

    public void pandeyfb(View view){

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/")));
    }

}
