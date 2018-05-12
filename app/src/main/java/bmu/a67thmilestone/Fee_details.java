package bmu.a67thmilestone;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Fee_details extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fee_details);
    }

    public void reg(View v){
        Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.67thmilestone.com/hospitality/"));
        startActivity(i);
    }
}
