package com.example.darrin.dashscam;
import android.view.View;
import android.net.Uri;
import 	android.content.Intent;

/**
 * Created by MLH-User on 10/15/2016.
 */

public class GoogleMapButtonOnclickListener implements View.OnClickListener{
    int placeId;

    public GoogleMapButtonOnclickListener(int placeId) {
        this.placeId = placeId;
    }

    @Override
    public void onClick(View v)
    {
        // Create a Uri from an intent string. Use the result to create an Intent.
        Uri gmmIntentUri = Uri.parse("geo:37.7749,-122.4194");

        // Create an Intent from gmmIntentUri. Set the action to ACTION_VIEW
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, gmmIntentUri);
        // Make the Intent explicit by setting the Google Maps package
        mapIntent.setPackage("com.google.android.apps.maps");

        // Attempt to start an activity that can handle the Intent
        startActivity(mapIntent);
    }

    public void startActivity(Intent intent){
        
    }

}
