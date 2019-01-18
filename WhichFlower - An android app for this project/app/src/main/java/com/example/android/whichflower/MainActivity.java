package com.example.android.whichflower;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {
    int choose = 1;
    static final int REQUEST_IMAGE_CAPTURE = 1;
    public static final int PICK_IMAGE = 1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton camera = (ImageButton) findViewById(R.id.Camera);
        camera.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choose = 1;
             dispatchTakePictureIntent();
            }
        });

        ImageButton gallery = (ImageButton) findViewById(R.id.gallery);

        gallery.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                choose = 0;
                Intent intent = new Intent();
                // Show only images, no videos or anything else
                intent.setType("image/*");
                intent.setAction(Intent.ACTION_GET_CONTENT);
                // Always show the chooser (if there are multiple options available)
                if(intent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(Intent.createChooser(intent, "Select Picture"), PICK_IMAGE);
                    //  dispatchTakePictureIntent();
                }else{
                    Toast.makeText(getApplicationContext(), "asas", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent();
        takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(choose == 0) {
            if (requestCode == PICK_IMAGE && resultCode == RESULT_OK && data != null && data.getData() != null) {
                Uri uri = data.getData();
                try {
                    Bitmap bitmap = MediaStore.Images.Media.getBitmap(getContentResolver(), uri);
                    // Log.d(TAG, String.valueOf(bitmap));
                    ImageView imageView = (ImageView) findViewById(R.id.image);
                    imageView.setImageBitmap(Bitmap.createScaledBitmap(bitmap, 3096, 3096, false));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        } else {
            if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
                ImageView mImageView = (ImageView) findViewById(R.id.image);
                Bundle extras = data.getExtras();
                Bitmap imageBitmap = (Bitmap) extras.get("data");
                mImageView.setImageBitmap(imageBitmap);
             }
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options_menu, menu);
        MenuItem item = menu.findItem(R.id.Search);
        item.setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
                                            public boolean onMenuItemClick(MenuItem item) {
                                                Intent intent = new Intent(MainActivity.this, About.class);
                                                startActivity(intent);
                                                return true;
                                            }
                                        }
        );
        return true;
    }
}