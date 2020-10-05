package com.ulan.timetable.adapters;

import com.ulan.timetable.activities.MainActivity;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;

public class NetworkAdapter {
    public static void MoveURL(String URL){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(URL));
    }
}
