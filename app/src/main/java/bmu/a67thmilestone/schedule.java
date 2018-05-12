package bmu.a67thmilestone;

import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;

import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class schedule extends AppCompatActivity {

    private static final String TAG = "Schedule";

    private SectionsPageAdapter mSectionsPageAdapter;

    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule);
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
        adapter.addFragment(new tab1(), "5th APRIL");
        adapter.addFragment(new tab2(), "6th APRIL");
        adapter.addFragment(new tab3(), "7th APRIL");
        viewPager.setAdapter(adapter);
    }
    public void fashion(View v){
        Intent i=new Intent(this,fashion_crave.class);
        startActivity(i);
    }
    public void battle(View v){
        Intent i=new Intent(this,battle_of_bands.class);
        startActivity(i);
    }
    public void bts(View v){
        Intent i=new Intent(this,beat_the_street.class);
        startActivity(i);
    }
    public void rc(View v){
        Intent i=new Intent(this,rc_nitro.class);
        startActivity(i);
    }
    public void theatre(View v){
        Intent i=new Intent(this,theatre_phantamonica.class);
        startActivity(i);
    }
    public void hack(View v){
        Intent i=new Intent(this,hack_bmu.class);
        startActivity(i);
    }
    public void planet(View v){
        Intent i=new Intent(this,planet_power_challenge.class);
        startActivity(i);
    }
    public void junk(View v){
        Intent i=new Intent(this,JunkyardWars.class);
        startActivity(i);
    }
    public void slam(View v){
        Intent i=new Intent(this,SlamPoetry.class);
        startActivity(i);
    }
    public void gq(View v){
        Intent i=new Intent(this,GeneralQuiz.class);
        startActivity(i);
    }
    public void vsm(View v){
        Intent i=new Intent(this,VirtualStockMarket.class);
        startActivity(i);
    }
    public void treasure(View v){
        Intent i=new Intent(this,TreasureHunt.class);
        startActivity(i);
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
    public void mechathing(View view) {
        Intent i=new Intent(this,Mechathing.class );
        startActivity( i );
    }
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
    public void pro1(View view){
        Intent i=new Intent(this,pronites.class);
        startActivity(i);
    }
    public void pro2(View view){
        Intent i=new Intent(this,pronites.class);
        startActivity(i);
    }
    public void pro3(View view){
        Intent i=new Intent(this,pronites.class);
        startActivity(i);
    }

    public void dance(View view){

        startActivity(new Intent(this,dance_en_solo.class));
    }
    public void brain_robo(View view){

        startActivity(new Intent(this,BrainweaveRobotics.class));
    }
    public void brain_iot(View view){

        startActivity(new Intent(this,BrainweaveIot.class));
    }
    public void hallsofsummer(View view){

        startActivity(new Intent(this,HallsofSummer.class));
    }

    public void gamerz(View view) {
        Intent i=new Intent(this,Battle_of_Gamerz.class );
        startActivity( i );
    }
    public void kairos(View view) {
        Intent i=new Intent(this,Kairos.class );
        startActivity( i );
    }

}