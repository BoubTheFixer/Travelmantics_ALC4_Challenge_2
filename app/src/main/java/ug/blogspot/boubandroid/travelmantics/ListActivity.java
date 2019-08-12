 package ug.blogspot.boubandroid.travelmantics;

 import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import com.firebase.ui.auth.AuthUI;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

 public class ListActivity extends AppCompatActivity {
     /*
     ArrayList<TravelDeal> deals;
     private FirebaseDatabase mFirebaseDatabase;
     private DatabaseReference mDatabaseReference;
     private ChildEventListener mChildListener;
     */
     @Override
     protected void onCreate(Bundle savedInstanceState) {
         super.onCreate(savedInstanceState);
         setContentView(R.layout.activity_list);
         /*
         FirebaseUtil.openFbReference("traveldeals", this);
         RecyclerView rvDeals = (RecyclerView) findViewById(R.id.rvDeals);
         final DealAdapter adapter = new DealAdapter();
         rvDeals.setAdapter(adapter);
         LinearLayoutManager dealsLayoutManager =
                 new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
         rvDeals.setLayoutManager(dealsLayoutManager);
         */
     }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.list_activity_menu, menu);
         return true;
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()) {
             case R.id.insert_menu:
                 Intent intent = new Intent(this, DealActivity.class);
                 startActivity(intent);
                 return true;
             case R.id.logout_menu:
                 AuthUI.getInstance()
                         .signOut(this)
                         .addOnCompleteListener(new OnCompleteListener<Void>() {
                             public void onComplete(@NonNull Task<Void> task) {
                                 Log.d("LogOut", "User Logged Out");
                                 FirebaseUtil.attachListener();
                             }
                         });
                 FirebaseUtil.detachListener();
                 return true;
         }
         return super.onOptionsItemSelected(item);
     }

     @Override
     protected void onPause() {
         super.onPause();
         FirebaseUtil.detachListener();
     }

     @Override
     protected void onResume() {
         super.onResume();

         FirebaseUtil.openFbReference("traveldeals", this);
         RecyclerView rvDeals = (RecyclerView) findViewById(R.id.rvDeals);
         final DealAdapter adapter = new DealAdapter();
         rvDeals.setAdapter(adapter);
         LinearLayoutManager dealsLayoutManager =
                 new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
         rvDeals.setLayoutManager(dealsLayoutManager);

         FirebaseUtil.attachListener();
     }
 }


/*
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.firebase.database.ChildEventListener;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

 public class ListActivity extends AppCompatActivity {
     ArrayList<TravelDeal> deals;
     private FirebaseDatabase mFirebaseDatabase;
     private DatabaseReference mDatabaseReference;
     private ChildEventListener mChildListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        */

        /*
        mFirebaseDatabase = FirebaseDatabase.getInstance();
        mDatabaseReference = mFirebaseDatabase.getReference().child("traveldeals");

        FirebaseUtil.openFbReference("traveldeals");
        mFirebaseDatabase = FirebaseUtil.mFirebaseDatabase;
        mDatabaseReference = FirebaseUtil.mDatabaseReference;

        mChildListener = new ChildEventListener() {
            @Override
            public void onChildAdded(DataSnapshot dataSnapshot, String s) {
                TextView tvDeals = (TextView) findViewById(R.id.tvDeals);
                TravelDeal td = dataSnapshot.getValue(TravelDeal.class);
                tvDeals.setText(tvDeals.getText() + "\n" + td.getTitle());
                //Log.d("Deal: ", td.getTitle());
            }

            @Override
            public void onChildChanged(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onChildRemoved(DataSnapshot dataSnapshot) {

            }

            @Override
            public void onChildMoved(DataSnapshot dataSnapshot, String s) {

            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        };

        mDatabaseReference.addChildEventListener(mChildListener);

        */
/*
        RecyclerView rvDeals = (RecyclerView) findViewById(R.id.rvDeals);
        final DealAdapter adapter = new DealAdapter();
        rvDeals.setAdapter(adapter);
        LinearLayoutManager dealsLayoutManager =
                new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        rvDeals.setLayoutManager(dealsLayoutManager);
    }

     @Override
     public boolean onCreateOptionsMenu(Menu menu) {
         MenuInflater inflater = getMenuInflater();
         inflater.inflate(R.menu.list_activity_menu, menu);
         return true;
     }

     @Override
     public boolean onOptionsItemSelected(MenuItem item) {
         switch (item.getItemId()) {
             case R.id.insert_menu:
                 Intent intent = new Intent(this, DealActivity.class);
                 startActivity(intent);
                 return true;
         }
         return super.onOptionsItemSelected(item);
     }

 }
 */