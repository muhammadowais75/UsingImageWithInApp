package com.example.moandroidapps.usingimagewithinapp;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;
import java.io.InputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv = (TextView) findViewById(R.id.long_dummy_text);
        String strValue = tv.getText().toString();

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < 10; i++) {
            stringBuilder.append(strValue).append("\n\n");
        }

        tv.setText(stringBuilder);


        //Adding Image on Runtime:
        //Here we are working with Resources
        //Recommendation: When you are working with single image. Keep everything in resources folder.
        ImageView iv = (ImageView) findViewById(R.id.another_image_view);
        //iv.setImageResource(R.drawable.logo1);

        //Finding Image file in the assets folder:
        //Here we are working with Assets
        //Recommendation: When you are working with multiple images. Keep them in assets folder.
        //It will make your app run faster. Because, assets folder is not compiled into an application.
        // And, Resource identifiers are not assigned.
        String fileName = "logo1.png";
        try {
            InputStream inputStream = getAssets().open(fileName);
            Drawable drawable = Drawable.createFromStream(inputStream, null);
            iv.setImageDrawable(drawable);
        } catch (IOException e) {
            e.printStackTrace();
        }//end catch
    }//onCreate
}