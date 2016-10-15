package com.example.darrin.dashscam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpPost;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONArray;

import android.util.Log;

/**
 * Created by Darrin on 2016-10-15.
 */

class readPlaces {
    String API_key = "AIzaSyBxMCOTGHxkqZcAjIqcPgJVYCDTveFhFo0";
    String parameters = "https://maps.googleapis.com/maps/api/place/nearbysearch/json?location=-33.8670522,151.1957362&radius=500&type=restaurant&key=";

    static InputStream is = null;
    static JSONObject jObj = null;
    static String json = "";
    // Connect to the URL using java's native library

    readPlaces() {
    }

    protected String getJSON(){
        try {
            return readUrl(parameters + API_key);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public String readUrl(String url) {

        try {
            URL urlString = new URL(url);
            HttpURLConnection con = (HttpURLConnection) urlString.openConnection();
            /*String readStream = readStream(con.getInputStream());*/

            InputStream in = urlString.openStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder result = new StringBuilder();
            String line;
            while((line = reader.readLine()) != null) {
                result.append(line);
            }

            JSONArray arr = new JSONArray(result);
            String name = "yes";
            /*for (int i = 0; i < arr.length(); i++) {
                JSONObject object = arr.getJSONObject(i);
                name = object.getString("name");
            }*/
            return name;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return "no";
    }

    private String readStream(InputStream in) {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(in));) {

            String nextLine = "";
            while ((nextLine = reader.readLine()) != null) {
                sb.append(nextLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
    /*private static String readUrl(String urlString) throws Exception {
        BufferedReader reader = null;
        try {
            URL url = new URL(urlString);
            reader = new BufferedReader(new InputStreamReader(url.openStream()));
            StringBuffer buffer = new StringBuffer();
            int read;
            char[] chars = new char[1024];
            while ((read = reader.read(chars)) != -1)
                buffer.append(chars, 0, read);

            return buffer.toString();
        } finally {
            if (reader != null)
                reader.close();
        }
    }*/
}