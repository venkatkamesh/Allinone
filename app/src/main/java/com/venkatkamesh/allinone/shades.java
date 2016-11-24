package com.venkatkamesh.allinone;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorMatrixColorFilter;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.FileNotFoundException;
import java.io.InputStream;

public class shades extends AppCompatActivity {

    ImageView shadeok;
    ImageButton shadebtn, shadebtn1, shadebtn2;
    Button camerac, galleryc;
    private static final int RESULT_LOAD_IMAGE = 1;
    private static final int CAMERA_REQUEST = 1888;
    private Intent receivedIntent;
    Bitmap bitmap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        receivedIntent = getIntent();

        setContentView(R.layout.activity_shades);
        shadeok =(ImageView)findViewById(R.id.shadeok);
        shadebtn =(ImageButton)findViewById(R.id.shadebtn);
        shadebtn.setColorFilter(new ColorMatrixColorFilter(NEGATIVE));
        shadebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shadeok.setColorFilter(new ColorMatrixColorFilter(NEGATIVE));
            }
        });
        shadebtn1 =(ImageButton)findViewById(R.id.shadebtn1);
        shadebtn1.setColorFilter(new ColorMatrixColorFilter(BLACKWHITE));
        shadebtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shadeok.setColorFilter(new ColorMatrixColorFilter(BLACKWHITE));
            }
        });
        shadebtn2 =(ImageButton)findViewById(R.id.shadebtn2);
        shadebtn2.setColorFilter(new ColorMatrixColorFilter(GREYSCALE));
        shadebtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shadeok.setColorFilter(new ColorMatrixColorFilter(GREYSCALE));
            }
        });
        camerac = (Button)findViewById(R.id.camerac);
        camerac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cameraIntent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(cameraIntent, CAMERA_REQUEST);
            }
        });
        galleryc = (Button)findViewById(R.id.galleryc);
        galleryc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Intent.ACTION_PICK, android.provider.MediaStore.Images.Media.EXTERNAL_CONTENT_URI);
                startActivityForResult(i, RESULT_LOAD_IMAGE);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == CAMERA_REQUEST && resultCode == Activity.RESULT_OK) {
            Bitmap photo = (Bitmap) data.getExtras().get("data");
            shadeok.setImageBitmap(photo);
            Bitmap photo1 = photo;
            Bitmap photo2 = photo;
            Bitmap photo3 = photo;

            shadebtn.setImageBitmap(createSepiaToningEffect(photo1, NEGATIVE));
            shadebtn1.setImageBitmap(createSepiaToningEffect1(photo2, BLACKWHITE));
            shadebtn2.setImageBitmap(createSepiaToningEffect2(photo3, GREYSCALE));
        }
        if (requestCode == RESULT_LOAD_IMAGE && resultCode == RESULT_OK && null != data) {
            Uri receivedUri = data.getData();
            if (receivedUri != null) {
                InputStream is = null;
                try {
                    is = getContentResolver().openInputStream(receivedUri);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                shadeok.setImageBitmap(BitmapFactory.decodeStream(is));
            }
            if (receivedUri != null) {
                InputStream is = null;
                try {
                    is = getContentResolver().openInputStream(receivedUri);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                bitmap = BitmapFactory.decodeStream(is);
                shadebtn.setImageBitmap(createSepiaToningEffect(bitmap, NEGATIVE));
            }

            if (receivedUri != null) {
                InputStream is = null;
                try {
                    is = getContentResolver().openInputStream(receivedUri);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                bitmap = BitmapFactory.decodeStream(is);
                shadebtn1.setImageBitmap(createSepiaToningEffect1(bitmap, BLACKWHITE));
            }

            if (receivedUri != null) {
                InputStream is = null;
                try {
                    is = getContentResolver().openInputStream(receivedUri);
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                }
                bitmap = BitmapFactory.decodeStream(is);
                shadebtn2.setImageBitmap(createSepiaToningEffect2(bitmap, GREYSCALE));
            }
        }
    }

    private Bitmap createSepiaToningEffect(Bitmap photo1, float[] negative) {
        shadebtn.setColorFilter(new ColorMatrixColorFilter(NEGATIVE));

        return photo1;
    }

    private Bitmap createSepiaToningEffect1(Bitmap photo2, float[] blackwhite) {
        shadebtn1.setColorFilter(new ColorMatrixColorFilter(BLACKWHITE));

        return photo2;
    }
    private Bitmap createSepiaToningEffect2(Bitmap photo3, float[] greyscale) {
        shadebtn2.setColorFilter(new ColorMatrixColorFilter(GREYSCALE));

        return photo3;
    }
    private static final float[] NEGATIVE ={
            -1.0f,     0,     0,    0, 255, // red
            0, -1.0f,     0,    0, 255, // green
            0,     0, -1.0f,    0, 255, // blue
            0,     0,     0, 1.0f,   0  // alpha
    };
    private static final float[] BLACKWHITE ={
            0, 0, 0, 0, 255,
            0, 0, 0, 0, 255,
            0, 0, 0, 0, 255,
            1, 1, 1, -1, 0,
    };
    private static final float[] GREYSCALE ={
            0, 0, 0, 0, 0,
            0, 0, 0, 0, 0,
            0, 0, 1, 0, 0,
            0, 0, 0, 1, 0
    };
}
