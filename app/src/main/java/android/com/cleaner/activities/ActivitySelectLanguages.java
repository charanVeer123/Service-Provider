package android.com.cleaner.activities;

import android.com.cleaner.R;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.orhanobut.hawk.Hawk;

import java.util.Locale;

import am.appwise.components.ni.NoInternetDialog;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class ActivitySelectLanguages extends AppCompatActivity implements View.OnClickListener {


    private Button btnEnglish, btnSpanish;
    private static long back_pressed;

    private NoInternetDialog noInternetDialog;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_languages);

        noInternetDialog = new NoInternetDialog.Builder(this).build();
        Hawk.init(this).build();
        changingStatusBarColorHere();
        findingIdsHere();
        eventsListner();


    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        noInternetDialog.onDestroy();
    }

    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }


    private void eventsListner() {
        btnEnglish.setOnClickListener(this);
        btnSpanish.setOnClickListener(this);
    }

    private void findingIdsHere() {
        btnEnglish = findViewById(R.id.btnEnglish);
        btnSpanish = findViewById(R.id.btnSpanish);
    }


    private void changingStatusBarColorHere() {
        getWindow().setStatusBarColor(ContextCompat.getColor(ActivitySelectLanguages.this, R.color.statusBarColor));

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnEnglish:
                Hawk.put("spanish",false);
                makingAppLanguagesLocalizeForEnglish();
                Intent intentEnglish = new Intent(ActivitySelectLanguages.this, ActivityMain.class);
                intentEnglish.putExtra("lang","en");
                startActivity(intentEnglish);
                break;
            case R.id.btnSpanish:
                Hawk.put("spanish",true);
                makingAppLanguagesLocalizeForSpanish();
                Intent intentSpanish = new Intent(ActivitySelectLanguages.this, ActivityMain.class);
                intentSpanish.putExtra("lang","es");
                startActivity(intentSpanish);

                break;

        }


    }

    private void makingAppLanguagesLocalizeForEnglish() {

        Locale locale = new Locale("en");
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());


    }

    private void makingAppLanguagesLocalizeForSpanish() {

        Locale locale = new Locale("es");
        Configuration config = getBaseContext().getResources().getConfiguration();
        config.locale = locale;
        getBaseContext().getResources().updateConfiguration(config, getBaseContext().getResources().getDisplayMetrics());


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();

//        if (back_pressed + 2000 > System.currentTimeMillis()) {
//            super.onBackPressed();
//        } else {
//            TastyToast.makeText(this, "Press back again to close this app !", TastyToast.LENGTH_LONG, TastyToast.WARNING).show();
//            back_pressed = System.currentTimeMillis();
//        }

    }


}
