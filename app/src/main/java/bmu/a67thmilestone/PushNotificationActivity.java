package bmu.a67thmilestone;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.HashMap;


public class PushNotificationActivity extends AppCompatActivity {
    private static final String TAG = PushNotificationActivity.class.getSimpleName();
    public static ArrayList<HashMap<String, String>> commentsre = new ArrayList<>();

    Context context;
    public static DatabaseReference databaseReference;
    Query queue;

    pushAdapter adapter;

    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_push_notification);
//        commentsre = new ArrayList<>();
        recyclerView = findViewById(R.id.recycler);

        recyclerView.setHasFixedSize(true);
        LinearLayoutManager lm_recycle = new LinearLayoutManager(context);
        lm_recycle.setReverseLayout(true);
        lm_recycle.setStackFromEnd(true);
        adapter = new pushAdapter();
        recyclerView.getRecycledViewPool().clear();
        recyclerView.setLayoutManager(lm_recycle);
        databaseReference = FirebaseDatabase.getInstance().getReference().child("notification");
        queue = databaseReference.orderByPriority();
        adapter.notifyDataSetChanged();
        recyclerView.setAdapter(adapter);
    }

    @Override
    protected void onResume() {
        super.onResume();
        try {
            queue.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    commentsre.clear();
                    for (DataSnapshot snapshot : dataSnapshot.getChildren()) {
//                    Log.e(TAG, "onDataChange:key " + snapshot.getKey());
//                    Log.e(TAG, "onDataChange: value" + snapshot.getValue());

                        HashMap<String, String> map = new HashMap<>();
                        pushModel data = snapshot.getValue(pushModel.class);

                        assert data != null;
                        map.put("message", data.getMessage());
                        commentsre.add(map);
//                    Log.e(TAG, "onDataChange:list " + commentsre);
                        adapter.notifyDataSetChanged();
                        recyclerView.setAdapter(adapter);
                    }
                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
        } catch (Exception e) {
            Log.e(TAG, "onResume: " + e.getMessage());
        }
    }

    public static class CommentViewHolder extends RecyclerView.ViewHolder {
        View view;
        TextView message;

        public CommentViewHolder(View itemView) {
            super(itemView);
            view = itemView;

            message = view.findViewById(R.id.noti);
        }

        public void setmessage(String mess) {

            message.setText(mess);
        }
    }
}


