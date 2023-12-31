package com.onkabetse.votesa.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.onkabetse.votesa.Manifest;
import com.onkabetse.votesa.R;

import de.hdodenhof.circleimageview.CircleImageView;

public class SignUpActivity extends AppCompatActivity {

    private CircleImageView userProfile;
    private EditText userName, userPassword, userEmail, userNationalID;
    private Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        findViewById(R.id.have_acc).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onBackPressed();
            }
        });

        userProfile = findViewById(R.id.profile_image);
        userName = findViewById(R.id.user_name);
        userPassword = findViewById(R.id.user_password);
        userEmail = findViewById(R.id.user_email);
        userNationalID = findViewById(R.id.user_national_id);
        signUpBtn = findViewById(R.id.signup_btn);

        //UserProfile

        userProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {

                    if (ContextCompat.checkSelfPermission(SignUpActivity.this,Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION ) != PackageManager.PERMISSION_GRANTED){
                           ActivityCompat.requestPermissions( SignUpActivity.this,Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION ,new String[]{Manifest.permission.DYNAMIC_RECEIVER_NOT_EXPORTED_PERMISSION},1);
                    }else{
                        cropImage();
                    }
                } else {
                    cropImage();
                }
            }
        });
    }
    private void cropImage() {
    }
}