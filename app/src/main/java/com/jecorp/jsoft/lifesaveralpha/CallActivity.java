package com.jecorp.jsoft.lifesaveralpha;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CallActivity extends AppCompatActivity {


    private Context mContext;
    private Activity mActivity;
    private Button mBtnDoTask, mBtnDoTask2, mBtnDoTask3, mBtnDoTask4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_call);

        // Get the application context
        mContext = getApplicationContext();
        mActivity = CallActivity.this;

        // Get the widget reference from xml layout
        mBtnDoTask = findViewById(R.id.callfire);
        mBtnDoTask2 = findViewById(R.id.callpolice);
        mBtnDoTask3 = findViewById(R.id.callambulance);
        mBtnDoTask4 = findViewById(R.id.callpln);

        // Set a click listener for the button
        mBtnDoTask.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialer();
            }
        });

        mBtnDoTask2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialer2();
            }
        });

        mBtnDoTask3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialer3();
            }
        });

        mBtnDoTask4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openDialer4();
            }
        });

    }

    // Custom method to open dialer app
    protected void openDialer(){
        /*
            Intent
                An intent is an abstract description of an operation to be performed. It can be
                used with startActivity to launch an Activity, broadcastIntent to send it to any
                interested BroadcastReceiver components, and startService(Intent) or
                bindService(Intent, ServiceConnection, int) to communicate with a background Service.

                An Intent provides a facility for performing late runtime binding between the code
                in different applications. Its most significant use is in the launching of
                activities, where it can be thought of as the glue between activities.
                It is basically a passive data structure holding an abstract description
                of an action to be performed.
        */
        /*
            String ACTION_DIAL
                Activity Action: Dial a number as specified by the data. This shows a UI with
                the number being dialed, allowing the user to explicitly initiate the call.

                Input: If nothing, an empty dialer is started; else getData() is URI of a phone
                number to be dialed or a tel: URI of an explicit phone number.

                Output: nothing.

                Constant Value: "android.intent.action.DIAL"
        */
        // Initialize an intent to open dialer app with specified phone number
        // It open the dialer app and allow user to call the number manually
        Intent intent = new Intent(Intent.ACTION_DIAL);
        // Send phone number to intent as data
        intent.setData(Uri.parse("tel:" + "113"));
        // Start the dialer app activity with number
        startActivity(intent);
    }

    protected void openDialer2(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "110"));
        startActivity(intent);
    }

    protected void openDialer3(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "118"));
        startActivity(intent);
    }

    protected void openDialer4(){
        Intent intent = new Intent(Intent.ACTION_DIAL);
        intent.setData(Uri.parse("tel:" + "123"));
        startActivity(intent);
    }

}
