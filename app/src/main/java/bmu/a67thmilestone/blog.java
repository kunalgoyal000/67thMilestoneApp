package bmu.a67thmilestone;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class blog extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blog);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        myWebView.loadUrl("https://67thmilestoneclub.wordpress.com/");
    }

}
