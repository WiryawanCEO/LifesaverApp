package com.jecorp.jsoft.lifesaveralpha;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MenuActivity extends AppCompatActivity {

    boolean doubleBackToExitPressedOnce = false;

    ImageView logo, torch, gosos, gocompass;
    TextView compasstitle, torchtitle, calltitle;
    Animation fromtop, fromsider, fromsidel, fadein;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        logo = (ImageView) findViewById(R.id.logo);
        torch = (ImageView) findViewById(R.id.torch);
        gosos = (ImageView) findViewById(R.id.gosos);
        gocompass = (ImageView) findViewById(R.id.gocompass);
        compasstitle = (TextView) findViewById(R.id.compasstitle);
        torchtitle = (TextView) findViewById(R.id.torchtitle);
        calltitle = (TextView) findViewById(R.id.calltitle);

        fromtop = AnimationUtils.loadAnimation(this, R.anim.fromtop);
        fromsider = AnimationUtils.loadAnimation(this, R.anim.fromsider);
        fromsidel = AnimationUtils.loadAnimation(this, R.anim.fromsidel);
        fromsider = AnimationUtils.loadAnimation(this, R.anim.fromsider);
        fadein = AnimationUtils.loadAnimation(this, R.anim.fadein);

        logo.setAnimation(fromtop);
        torch.setAnimation(fromsidel);
        torchtitle.setAnimation(fadein);
        gosos.setAnimation(fromsidel);
        calltitle.setAnimation(fadein);
        gocompass.setAnimation(fromsider);
        compasstitle.setAnimation(fadein);

    }

    public void gotorch(View v){
        startActivity(new Intent(MenuActivity.this, TorchActivity.class));
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void gocompass(View v){
        startActivity(new Intent(MenuActivity.this, CompassActivity.class));
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    public void gocall(View v){
        startActivity(new Intent(MenuActivity.this, CallActivity.class));
        overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out);
    }

    @Override
    public void onBackPressed() {
        if (doubleBackToExitPressedOnce) {
            super.onBackPressed();
            return;
        }

        this.doubleBackToExitPressedOnce = true;
        Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

        new Handler().postDelayed(new Runnable() {

            @Override
            public void run() {
                doubleBackToExitPressedOnce=false;
            }
        }, 2000);
    }

}
