package com.example.darrin.dashscam;
import android.app.Activity;
import android.content.ComponentName;
import android.os.Bundle;
import android.view.View;
import android.net.Uri;
import android.content.Intent;
import android.content.Context;
import java.util.Locale;
import java.util.logging.ErrorManager;

/**
 * Created by MLH-User on 10/15/2016.
 */

class GoogleMapButtonOnclickListener extends Activity implements View.OnClickListener{
    String placeId;

    GoogleMapButtonOnclickListener(String placeId) {
        this.placeId = placeId;
    }

    @Override
    public void onClick(View v){
        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        mapIntent.setPackage("com.google.android.apps.maps");
        if (mapIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(mapIntent);
        }
    }

    /*@Override
    public void onClick(View v){
        final Intent intent = new Intent(Intent.ACTION_MAIN, null);

        intent.addCategory(Intent.CATEGORY_LAUNCHER);

        final ComponentName cn = new ComponentName("com.android.settings", "com.android.settings.fuelgauge.PowerUsageSummary");

        intent.setComponent(cn);

        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }

    public void onClick(View v)
    {
        // Create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse("geo:43.0147,-81.3049");

        // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        // Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");

        // Attempt to start an activity that can handle the Intent
        this.getgetContext().startActivity(mapIntent);
    }*/

    /*
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera_screen);
    }

    @Override
    public static void onClick(Context c){
        Intent it = new Intent(c,CameraScreen.class);
        c.startActivity(it);
    }

    public void startActivity(Intent intent){
        String uri = String.format(Locale.ENGLISH, "geo:%f,%f", 43.0147, -81.3049);
        intent = new Intent(Intent.ACTION_VIEW, Uri.parse(uri));
        startActivity(intent);
    }*/

}
