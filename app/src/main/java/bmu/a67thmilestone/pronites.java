package bmu.a67thmilestone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bluejamesbond.text.DocumentView;
import com.bluejamesbond.text.style.TextAlignment;

public class pronites extends AppCompatActivity {

    ImageView I1;
    ImageView I2;
    ImageView I3;
    ImageView I4;
    DocumentView t1;
    DocumentView t2;
    DocumentView t3;
    DocumentView t4;
    int count;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pronites);
        DocumentView documentView = new DocumentView(this, DocumentView.PLAIN_TEXT);  // Support plain text
        documentView.getDocumentLayoutParams().setTextAlignment(TextAlignment.JUSTIFIED);
        I1 = (ImageView) findViewById(R.id.pronite1);
        I2 = (ImageView) findViewById(R.id.pronite2);
        I3 = (ImageView) findViewById(R.id.pronite3);
        I4 =(ImageView)findViewById(R.id.pronite4);
        t1 = (DocumentView) findViewById(R.id.pro1);
        t2 = (DocumentView) findViewById(R.id.pro2);
        t3 = (DocumentView) findViewById(R.id.pro3);
        t4=(DocumentView)findViewById(R.id.pro4);
    }
    public void pronight1(View v) {
        if (I1.getVisibility() == View.VISIBLE) {
            if (count == 0) {
                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t1.setText("Get ready for some magical madness in the house - The PARASHARA band is gonna set the stage on fire.\n" +
                        "\n" +
                        "67th Milestone 2018 is proud to host them on April 5th");
                t1.setVisibility(View.VISIBLE);
                count++;

            } else {
                t1.setText("");
                t1.setVisibility(View.GONE);
                count = 0;
            }

        }
    }

    public void pronight2(View v) {
        if (I2.getVisibility() == View.VISIBLE) {
            if (count == 0) {
                t1.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t2.setText("Let the craziness multifold, With the music and beats of \"Babbal Rai\" on the floor.\n" +
                        "\n" + "67th Milestone presents Punjabi Tadka on April 5th from 9:30 PM onwards!");
                t2.setVisibility(View.VISIBLE);
                count++;

            } else {
                t2.setText("");
                t2.setVisibility(View.GONE);
                count = 0;
            }
        }
    }

    public void pronight3(View v) {
        if (I3.getVisibility() == View.VISIBLE) {
            if (count == 0) {
                t1.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t4.setVisibility(View.GONE);
                t3.setText("It's time for the bass drop!Groove to the music and Dance your heart out!It's time to pull down the drapes and rave till hell bends over." +
                                "\n" +
                                "SunBurn Campus featuring internationally acclaimed DJ Artist - Julia Bliss as the headliner act with DJ Shashank (supporting act) and Basspitch (opening act) present to set the stage on fire on the 6th April, 2018.");
                t3.setVisibility(View.VISIBLE);
                count++;

            } else {
                t3.setText("");
                t3.setVisibility(View.GONE);
                count = 0;
            }

        }
    }
    public void pronight4(View v) {
        if (I4.getVisibility() == View.VISIBLE) {
            if (count == 0) {
                t1.setVisibility(View.GONE);
                t2.setVisibility(View.GONE);
                t3.setVisibility(View.GONE);
                t4.setText("In the end,Laughing our hearts out with Canvas Laugh Club artists Mr: Aditya Dubey and Mr: Pritish Narula for the Comedy Show on 7th April, 2018.");
                t4.setVisibility(View.VISIBLE);
                count++;

            } else {
                t4.setText("");
                t4.setVisibility(View.GONE);
                count = 0;
            }

        }
    }
}