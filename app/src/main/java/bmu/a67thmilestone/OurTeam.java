package bmu.a67thmilestone;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OurTeam extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_our_team);
    }


    public void maildj(View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"danish.jameel.15csc@bml.edu.in"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkeddj(View view){

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com")));
    }

    public void djfb(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/danish.jameel.180")));

    }
    public void maillovish(View view) {

        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"lovish.wadhwa.16cse@bml.edu.in"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedlovish(View view){

        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com")));
    }

    public void lovishfb(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/")));

    }

    public void tbmail(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"tushar.bhatia.15csc@bml.edu.in"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedtb(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://in.linkedin.com/in/tushar-bhatia-b6814073")));

    }

    public void tbfb(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/tushar.bhatia.5")));

    }

    public void mailakhil(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"DADU.REDDY.15ECE@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedakhil(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/akhil-reddy-90809110b")));

    }

    public void akhilfb(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/akhil.reddy1608")));

    }

    public void mailmanav(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"MANAV.GUPTA.15CSE@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedmanav(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/manav-gupta-15ba80111/")));

    }

    public void fbmanav(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/manav.gupta.94617999")));

    }

    public void mailbhargava(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"NS.BHARGAVA.15CSE@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedbhargava(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com")));

    }

    public void fbbhargava(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/bhargava.sai.5")));

    }

    public void mailsankalp(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"SANKALP.PASRICHA.15CSC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedsankalp(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sankalp-pasricha-62958310b")));

    }

    public void fbsankalp(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/sankalp.pasricha?ref=bookmarks")));

    }

    public void mailsharath(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"K.SHARATH.15CSE@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedsharath(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sharath-k-chandra-b0b03a10b ")));

    }

    public void fbsharath(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sharath.k.chandra.11")));

    }

    public void mailsamhitha(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"SAMHITHA.MADALA.15CSC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedsamhitha(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/samhitha-madala-b16a3a123")));

    }

    public void fbsamhitha(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/profile.php?id=100009409497502")));

    }

    public void mailthomas(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"THOMAS.ABRAHAM.15MEC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedthomas(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/thomas-abraham-29349310b/")));

    }

    public void fbthomas(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/thomas.abraham.775")));

    }

    public void mailhimanshi(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"HIMANSHI.THAWRANI.16CSE@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedhimanshi(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/himanshi-thawrani-567a3512b/")));

    }

    public void fbhimanshi(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/h.thawrani97?ref=bookmarks")));

    }

    public void mailsreekar(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"S.SREEKAR.15MEC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedsreekar(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sreekar-reddy-07036910b/")));

    }

    public void fbsreekar(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/sreekarreddy1998")));

    }

    public void mailharshad(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"HARSHAD.KALANTRI.15CSC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedharshad(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/harshad-kalantri-34258310b/")));

    }

    public void fbharshad(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/Harshad.Kalantri.15")));

    }
    public void mailnikhitha(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ATLURI.NIKHITHA.16CSE@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkednikhitha(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com")));

    }

    public void fbnikhitha(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebbok.com")));

    }
    public void mailaastha(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"AASTHA.JAIN.15BCK@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedaastha(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/aastha-jain-53b5a4123/")));

    }

    public void fbaastha(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/aasthajain15")));

    }
    public void mailkiran(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"K.SAI.15CSC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedkiran(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/sai-kiran-kintali-0a301510b/")));

    }

    public void fbkiran(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/DrunkenMaster9290")));

    }
    public void mailshubham(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"SHUBHAM.DHINGRA.16MEC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedshubham(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.likedin.com/shubhamdhingra15s")));

    }

    public void fbshubham(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("www.facebook.com/shubhamdhingra15s")));

    }

    public void mailnishit(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"NISHIT.GARG.15CSC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkednishit(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/nishit-garg-9684b7123/")));

    }

    public void fbnishit(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/nishit.garg.37")));

    }

    public void mailnaman(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"NAMAN.KHETAWAT.15CSC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkednaman(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com")));

    }

    public void fbnaman(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com")));

    }
    public void mailnatasha(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"K.NATASHA.15BCK@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkednatasha(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/k-natasha-dora-871188121/")));

    }

    public void fbnatasha(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/natasha.dora")));

    }

    public void mailmahima(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"MAHIMA.CHOPRA.15CSC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedmahima(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.instagram.com/mahima_chopra21/")));

    }

    public void fbmahima(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mahima.chopra.52")));

    }

    public void mailshreya(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"SHREYA.MATHUR.15BK@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedshreya(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/shreya-mathur-b53492102")));

    }

    public void fbshreya(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/shreya.mathur.12327")));

    }


    public void mailsharma(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"ASTHA.SHARMA.16MEC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedsharma(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/astha-sharma-a95208150/")));

    }

    public void fbsharma(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com")));

    }
    public void mailsablok(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"MEHAK.SABLOK.15ECE@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedsablok(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://linkedin.com/in/mehak-sablok-53bb66120")));

    }

    public void fbsablok(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/100001028423616")));

    }
    public void mailtanya(View view){
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"TANYA.AGARWAL.16CSC@BML.EDU.IN"});
        intent.setType("message/rfc822");
        startActivity(intent);
    }

    public void linkedtanya(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://linkedin.com")));

    }

    public void fbtanya(View view){
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/home.php?hrc=1&refsrc=http%3A%2F%2Fh.facebook.com%2Fhr%2Fr")));

    }



}
