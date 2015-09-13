package com.google.android.gms.nearby.messages.samples.nearbydevices;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import android.util.Log;

import java.io.ByteArrayOutputStream;

/**
 * Created by arnab.saha on 9/11/2015.
 */
public class imagePayload{


    public imagePayload(){
    }

    public String getBitmap(Context context){
        Bitmap bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.img122);
        String b64 = encodeTobase64(bitmap);
        return b64;
    }

    public static String encodeTobase64(Bitmap image) {

        Bitmap immagex=image;
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        immagex.compress(Bitmap.CompressFormat.JPEG, 100, baos);
        byte[] b = baos.toByteArray();
        String imageEncoded = Base64.encodeToString(b, Base64.DEFAULT);

        Log.e("LOOK", imageEncoded);
        return imageEncoded;
    }
}
