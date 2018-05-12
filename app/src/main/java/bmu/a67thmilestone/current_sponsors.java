package bmu.a67thmilestone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import bmu.a67thmilestone.R;

public class current_sponsors extends AppCompatActivity {


    String[] countries = new String[] {
            "Title Sponsor",
            "Banking Partner",
            "Co-Presented by",
            "Multi-cuisine Partner",
            "Secured by",
            "Co-sponsored by",
            "Fitness Partner",
            "Food Partner",
            "Agriculture Partner",
            "Laughter Partner",
            "Newspaper Partner",
            "Recording Partner",
            "Talent Partner",
            "Powered by",
            "In Association With",
            "Audio Partner",
            "Outreach Partner",
            "Gifting Partner",
            "Workshop Partner",
            "Youth Partner",
            "Digital Partner",
            "Experience Partner",
            "Student Partner",
            "Social Cause Partner",
            "Digital Partner",
            "Web Hosting Partner",
            "Counselling Partner",
            "Restaurant Partner",
            "Internship & Training Partner",
            "Videography Partner",
            "Education Partner",
            "Merchandise Partner",
            "Pro Night Partner",
            "Refreshment Partner",
            "Styling Partner",
            "CSR Partner",
            "Entertainment Partner",
            "Travel Partner",
            "Printing Partner",
            "Events Partners","","","","","","","","","","","","","",
            "Media Partners","","","","","","","","","","",""
    };

    int[] flags = new int[]{
            R.drawable.a,
            R.drawable.a3,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.a22,
            R.drawable.i,
            R.drawable.j,
            R.drawable.k,
            R.drawable.l,
            R.drawable.m,
            R.drawable.n,
            R.drawable.o,
            R.drawable.p,
            R.drawable.q,
            R.drawable.r,
            R.drawable.s,
            R.drawable.t,
            R.drawable.u,
            R.drawable.v,
            R.drawable.w,
            R.drawable.x,
            R.drawable.y,
            R.drawable.z,
            R.drawable.aa,
            R.drawable.bb,
            R.drawable.cc,
            R.drawable.a19,
            R.drawable.ee,
            R.drawable.ff,
            R.drawable.gg,
            R.drawable.hh,
            R.drawable.aaa,
            R.drawable.bbb,
            R.drawable.ccc,
            R.drawable.ddd,
            R.drawable.eee,
            R.drawable.ii,
            R.drawable.l,
            R.drawable.kk,
            R.drawable.s,
            R.drawable.mm,
            R.drawable.nn,
            R.drawable.a19,
            R.drawable.r,
            R.drawable.aaa,
            R.drawable.g,
            R.drawable.cc,
            R.drawable.p,
            R.drawable.fff,
            R.drawable.m,
            R.drawable.kk,
            R.drawable.qq,
            R.drawable.rr,
            R.drawable.ss,
            R.drawable.tt,
            R.drawable.uu,
            R.drawable.vv,
            R.drawable.ww,
            R.drawable.xx,
            R.drawable.yy,
            R.drawable.zz,
            R.drawable.fff

    };



    ListView listView;

    @Override


    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.current_sponsors);

        listView = (ListView)findViewById(R.id.listview);

        List<HashMap<String,String>> aList = new ArrayList<HashMap<String,String>>();

        for(int i=0;i<65    ;i++){
            HashMap<String, String> hm = new HashMap<String,String>();
            hm.put("name", "" + countries[i]);
            hm.put("flag", Integer.toString(flags[i])

            );
            aList.add(hm);
        }


        String[] from = { "flag","name" };


        int[] to = { R.id.flag,R.id.name};

        SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.textviews, from, to);


        ListView listView = ( ListView ) findViewById(R.id.listview);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent sponsers = new Intent(Intent.ACTION_VIEW);
                switch(position) {
                    case 0:
                        sponsers.setData(Uri.parse("http://www.heromotocorp.com/en-in/"));
                        startActivity(sponsers);
                        break;
                    case 1:

                        sponsers.setData(Uri.parse("https://www.yesbank.in/"));
                        startActivity(sponsers);
                        break;
                    case 2:

                        sponsers.setData(Uri.parse("http://www.herofutureenergies.com/"));
                        startActivity(sponsers);
                        break;
                    case 3:

                        sponsers.setData(Uri.parse("http://www.lbf.co.in/"));
                        startActivity(sponsers);
                        break;
                    case 4:

                        sponsers.setData(Uri.parse("http://lionmanpower.com/"));
                        startActivity(sponsers);
                        break;
                    case 5:

                        sponsers.setData(Uri.parse("http://www.iffco.in/"));
                        startActivity(sponsers);
                        break;
                    case 6:
                        sponsers.setData(Uri.parse("https://www.firefoxbikes.com/"));
                        startActivity(sponsers);

                        break;
                    case 7:

                        sponsers.setData(Uri.parse("http://www.compass-group.co.in/"));
                        startActivity(sponsers);

                        break;
                    case 8:

                        sponsers.setData(Uri.parse("https://www.kribhco.net/"));
                        startActivity(sponsers);
                        break;
                    case 9:

                        sponsers.setData(Uri.parse("https://canvaslaughclub.com/"));
                        startActivity(sponsers);
                        break;
                    case 10:

                        sponsers.setData(Uri.parse("http://epaper.dainiksaveratimes.com/"));
                        startActivity(sponsers);
                        break;
                    case 11:

                        sponsers.setData(Uri.parse("http://resonancestudios.in/"));
                        startActivity(sponsers);
                        break;
                    case 12:

                        sponsers.setData(Uri.parse("https://songdew.com/"));
                        startActivity(sponsers);
                        break;
                    case 13:

                        sponsers.setData(Uri.parse("http://www.mtvbeats.in/"));
                        startActivity(sponsers);
                        break;
                    case 14:

                        sponsers.setData(Uri.parse("http://www.vh1.in/"));
                        startActivity(sponsers);
                        break;
                    case 15:

                        sponsers.setData(Uri.parse("https://zebronics.com/"));
                        startActivity(sponsers);
                        break;
                    case 16:

                        sponsers.setData(Uri.parse("https://www.wittyfeed.com/"));
                        startActivity(sponsers);
                        break;
                    case 17:

                        sponsers.setData(Uri.parse("https://tredily.com/"));
                        startActivity(sponsers);
                        break;
                    case 18:

                        sponsers.setData(Uri.parse("http://www.brainweave.co.in/"));
                        startActivity(sponsers);
                        break;
                    case 19:

                        sponsers.setData(Uri.parse("https://www.campustimespune.com/"));
                        startActivity(sponsers);
                        break;
                    case 20:

                        sponsers.setData(Uri.parse("https://www.yourquote.in/"));
                        startActivity(sponsers);
                        break;

                    case 21:

                        sponsers.setData(Uri.parse("https://www.xoxoday.com/"));
                        startActivity(sponsers);
                        break;
                    case 22:

                        sponsers.setData(Uri.parse("http://integer-innovation.in/"));
                        startActivity(sponsers);
                        break;
                    case 23:

                        sponsers.setData(Uri.parse("http://www.kefindia.org/"));
                        startActivity(sponsers);
                        break;
                    case 24:

                        sponsers.setData(Uri.parse("https://www.facebook.com/aagmanarrivalofdreamsofficial/"));
                        startActivity(sponsers);
                        break;

                    case 25:

                        sponsers.setData(Uri.parse("https://www.znetlive.com/"));
                        startActivity(sponsers);
                        break;
                    case 26:

                        sponsers.setData(Uri.parse("https://www.careers360.com/"));
                        startActivity(sponsers);
                        break;
                    case 27:

                        sponsers.setData(Uri.parse("http://moets.com/coco-palm/"));
                        startActivity(sponsers);
                        break;
                    case 28:

                        sponsers.setData(Uri.parse("https://internshala.com/"));
                        startActivity(sponsers);
                        break;
                    case 29:

                        sponsers.setData(Uri.parse("https://www.facebook.com/67milestone/photos/a.271584589947190.1073741829.230596484046001/429671250805189/?type=3&theater"));
                        startActivity(sponsers);
                        break;
                    case 30:

                        sponsers.setData(Uri.parse("http://www.aceenggacademy.com/"));
                        startActivity(sponsers);
                        break;
                    case 31:

                        sponsers.setData(Uri.parse("https://www.thesouledstore.com/"));
                        startActivity(sponsers);
                        break;
                    case 32:

                        sponsers.setData(Uri.parse("https://www.facebook.com/incredibleinclusions/"));
                        startActivity(sponsers);
                        break;
                    case 33:

                        sponsers.setData(Uri.parse("https://freestand.in/"));
                        startActivity(sponsers);
                        break;

                    case 34:

                    sponsers.setData(Uri.parse("http://www.spykar.com/"));
                    startActivity(sponsers);
                    break;

                    case 35:

                        sponsers.setData(Uri.parse(" https://www.facebook.com/therkmfoundation/"));
                        startActivity(sponsers);
                        break;
                    case 36:

                        sponsers.setData(Uri.parse("http://www.lordofthedrinks.in/"));
                        startActivity(sponsers);
                        break;
                    case 37:

                        sponsers.setData(Uri.parse("http://www.eaglecabs.in/"));
                        startActivity(sponsers);
                        break;
                    case 38:

                        sponsers.setData(Uri.parse("http://www.raghavcreation.com/"));
                        startActivity(sponsers);
                        break;
                    case 39:

                        sponsers.setData(Uri.parse("http://www.delhidanceacademy.in/"));
                        startActivity(sponsers);
                        break;

                    case 40:

                        sponsers.setData(Uri.parse("http://resonancestudios.in/"));
                        startActivity(sponsers);
                        break;
                    case 41:

                        sponsers.setData(Uri.parse("https://www.facebook.com/Du-Assassins-1760313117334909/"));
                        startActivity(sponsers);
                        break;
                    case 42:

                        sponsers.setData(Uri.parse("http://www.brainweave.co.in/"));
                        startActivity(sponsers);
                        break;
                    case 43:

                        sponsers.setData(Uri.parse("http://www.i3indyatechnologies.com/"));
                        startActivity(sponsers);
                        break;
                    case 44:

                        sponsers.setData(Uri.parse("http://www.absolute-barbecue.com/"));
                        startActivity(sponsers);
                        break;
                    case 45:

                        sponsers.setData(Uri.parse("https://www.facebook.com/67milestone/photos/a.271584589947190.1073741829.230596484046001/429671250805189/?type=3&theater"));
                        startActivity(sponsers);
                        break;
                    case 46:

                        sponsers.setData(Uri.parse("https://tredily.com/"));
                        startActivity(sponsers);
                        break;
                    case 47:

                        sponsers.setData(Uri.parse("http://www.spykar.com/"));
                        startActivity(sponsers);
                        break;
                    case 48:

                        sponsers.setData(Uri.parse("https://www.firefoxbikes.com/"));
                        startActivity(sponsers);
                        break;
                    case 49:

                        sponsers.setData(Uri.parse("https://internshala.com/"));
                        startActivity(sponsers);
                        break;
                    case 50:

                        sponsers.setData(Uri.parse("https://zebronics.com/"));
                        startActivity(sponsers);
                        break;
                    case 51:

                        sponsers.setData(Uri.parse("http://www.wileyindia.com/"));
                        startActivity(sponsers);
                        break;
                    case 52:

                        sponsers.setData(Uri.parse("https://songdew.com/"));
                        startActivity(sponsers);
                        break;
                    case 53:

                        sponsers.setData(Uri.parse("https://www.facebook.com/Du-Assassins-1760313117334909/"));
                        startActivity(sponsers);
                        break;
                    case 54:

                        sponsers.setData(Uri.parse("http://ohcampus.com/v2/"));
                        startActivity(sponsers);
                        break;
                    case 55:
                        sponsers.setData(Uri.parse("http://festpav.com/"));
                        startActivity(sponsers);
                        break;
                    case 56:

                        sponsers.setData(Uri.parse("https://indiacollegefest.com/"));
                        startActivity(sponsers);
                        break;
                    case 57:

                        sponsers.setData(Uri.parse("https://www.duexpress.in/"));
                        startActivity(sponsers);
                        break;
                    case 58:

                        sponsers.setData(Uri.parse("http://www.aapkatimes.com/"));
                        startActivity(sponsers);
                        break;
                    case 59:

                        sponsers.setData(Uri.parse("http://www.danceninspire.com/"));
                        startActivity(sponsers);
                        break;
                    case 60:

                        sponsers.setData(Uri.parse("http://festflick.com/"));
                        startActivity(sponsers);
                        break;
                    case 61:

                        sponsers.setData(Uri.parse("http://www.knowafest.com/"));
                        startActivity(sponsers);
                        break;
                    case 62:

                        sponsers.setData(Uri.parse("http://newdelhitimes.com/"));
                        startActivity(sponsers);
                        break;
                    case 63:

                        sponsers.setData(Uri.parse("https://usocl.com/"));
                        startActivity(sponsers);
                        break;
                    case 64:

                        sponsers.setData(Uri.parse("http://www.wileyindia.com/"));
                        startActivity(sponsers);
                        break;

                }

            }
        });



    }
}