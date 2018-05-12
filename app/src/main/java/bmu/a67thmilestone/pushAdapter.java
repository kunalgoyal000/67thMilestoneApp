package bmu.a67thmilestone;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.HashMap;

import static bmu.a67thmilestone.PushNotificationActivity.commentsre;

/**
 * Created by Abhilash Annaluru on 04-04-2018.
 */

public class pushAdapter extends RecyclerView.Adapter<PushNotificationActivity.CommentViewHolder> {
    private static final String TAG = pushAdapter.class.getSimpleName();

    @Override
    public PushNotificationActivity.CommentViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View row_itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.notificationclass, parent, false);

        PushNotificationActivity.CommentViewHolder vh = new PushNotificationActivity.CommentViewHolder(row_itemView);
        return vh;
    }

    @Override
    public void onBindViewHolder(PushNotificationActivity.CommentViewHolder holder, int position) {

        try {

            HashMap<String, String> searchModel = PushNotificationActivity.commentsre.get(position);
            String comment = searchModel.get("message");

            Log.e(TAG, "onBindViewHolder: " + commentsre.size()+" "
                    + comment);

            holder.setmessage(comment);


        } catch (Exception e) {

            Log.e(TAG, "onBindViewHolder: " + e.getMessage());
        }


    }

    @Override
    public int getItemCount() {
        return commentsre.size();
    }
}
