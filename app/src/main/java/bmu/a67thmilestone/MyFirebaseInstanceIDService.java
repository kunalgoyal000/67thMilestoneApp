package bmu.a67thmilestone;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by Abhilash Annaluru on 04-04-2018.
 */

public class MyFirebaseInstanceIDService extends FirebaseInstanceIdService {

    private static final String TAG = MyFirebaseInstanceIDService.class.getSimpleName();

    @Override
    public void onTokenRefresh() {
//        super.onTokenRefresh();

        String recenttoken = FirebaseInstanceId.getInstance().getToken();

        Log.e(TAG, "onTokenRefresh: "+recenttoken );
    }
}