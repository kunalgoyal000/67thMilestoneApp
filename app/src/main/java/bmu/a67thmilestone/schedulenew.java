package bmu.a67thmilestone;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

public class schedulenew extends AppCompatActivity {

    private static final String TAG = "Events";

    public SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule2);
        Log.d(TAG, "onCreate: Starting.");

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);
    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new eventtab1(), "FLAGSHIP");
        adapter.addFragment(new eventtab2(), "MAJOR");
        adapter.addFragment(new eventtab3(), "MINOR");
        viewPager.setAdapter(adapter);
    }

    public void robosoccer(View view) {
        Intent i=new Intent(this,robo_soccer.class );
        startActivity( i );
    }
    public void roborace(View view) {
        Intent i=new Intent(this,robo_race.class );
        startActivity( i );
    }
    public void linefollower(View view) {
        Intent i=new Intent(this,Line_follower.class );
        startActivity( i );
    }
    public void aerial(View view) {
        Intent i=new Intent(this,Aerial_Drones.class );
        startActivity( i );
    }
    public void robowars(View view) {
        Intent i=new Intent(this,robo_wars.class );
        startActivity( i );
    }
//    public void mechathing(View view) {
//        Intent i=new Intent(this,Mechathing.class );
//        startActivity( i );
//    }
    public void masterchef(View view) {
        Intent i=new Intent(this,BMU_MasterChef.class );
        startActivity( i );
    }
    public void pitchers(View view) {
        Intent i=new Intent(this,BMU_Pichers.class );
        startActivity( i );
    }
    public void rihaai(View view) {
        Intent i=new Intent(this,Rihaai.class );
        startActivity( i );
    }
    public void grappling(View view) {
        Intent i=new Intent(this,Grappling_Tournament.class );
        startActivity( i );
    }
    public void TSEC(View view) {
        Intent i=new Intent(this,TSEC_Summit.class );
        startActivity( i );
    }
    public void gamerz(View view) {
        Intent i=new Intent(this,Battle_of_Gamerz.class );
        startActivity( i );
    }
    public void kairos(View view) {
        Intent i=new Intent(this,Kairos.class );
        startActivity( i );
    }

    public void junkyardwars(View view){

        startActivity(new Intent(this,JunkyardWars.class));
    }

    public void treasurehunt(View view){

        startActivity(new Intent(this,TreasureHunt.class));
    }

    public void vsmarket(View view){

        startActivity(new Intent(this,VirtualStockMarket.class));
    }

    public void slampoetry(View view){
        startActivity(new Intent(this,SlamPoetry.class));
    }

    public void generalquiz(View view){

        startActivity(new Intent(this,GeneralQuiz.class));
    }
    public void nitro(View view){

        startActivity(new Intent(this,rc_nitro.class));
    }
    public void theatrep(View view){

        startActivity(new Intent(this,theatre_phantamonica.class));
    }

    public void beatthestreet(View view){

        startActivity(new Intent(this,beat_the_street.class));
    }
    public void bob(View view){

        startActivity(new Intent(this,battle_of_bands.class));
    }

    public void fashioncrave(View view){

        startActivity(new Intent(this,fashion_crave.class));
    }

    public void hackbml(View view){

        startActivity(new Intent(this,hack_bmu.class));
    }

    public void power(View view){

        startActivity(new Intent(this,planet_power_challenge.class));
    }

    public void hallsofsummer(View view){

        startActivity(new Intent(this,HallsofSummer.class));
    }
    public void dance1(View view){

        startActivity(new Intent(this,dance_en_solo.class));
    }
    public void brain_robo(View view){

        startActivity(new Intent(this,BrainweaveRobotics.class));
    }
    public void brain_iot(View view){

        startActivity(new Intent(this,BrainweaveIot.class));
    }
}