package bmu.a67thmilestone;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Handler;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {



    private TextView journey;
    private ImageView imgLogo;
    private static int SPLASH_TIME_OUT = 3000;
    public boolean isFirstStart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        journey = (TextView) findViewById(R.id.journey);
        imgLogo = (ImageView) findViewById(R.id.imgLogo);
        Animation myanim = AnimationUtils.loadAnimation(this,R.anim.mytransition);
        journey.startAnimation(myanim);
        imgLogo.startAnimation(myanim);

        new Handler().postDelayed(new Runnable() {


            @Override
            public void run() {
                Thread t = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        SharedPreferences getSharedPreferences = PreferenceManager
                                .getDefaultSharedPreferences(getBaseContext());

                        isFirstStart = getSharedPreferences.getBoolean("firstStart", true);

                        if (isFirstStart) {

                            Intent i = new Intent(SplashScreen.this, MainActivity.class);
                            startActivity(i);
                            SharedPreferences.Editor e = getSharedPreferences.edit();
                            e.putBoolean("firstStart", false);
                            e.apply();
                            finish();
                        }
                        else
                        {
                            Intent i = new Intent(SplashScreen.this, MainActivity.class);
                            startActivity(i);
                            finish();
                        }
                    }
                });
                t.start();

            }
        }, SPLASH_TIME_OUT);
    }
}
