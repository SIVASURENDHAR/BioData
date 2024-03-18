// home2Activity.java

package com.example.personaldetails;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class home2Activity extends AppCompatActivity {


    EditText e1, e2, e3, e4, e5, e6, e7, e8, e9, e10, e11, e12, e13, e14, e15;
    Button b1;
    Uri photoUri;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_home2);

        e1 = findViewById(R.id.faname);
        e2 = findViewById(R.id.pnum);
        e3 = findViewById(R.id.address);
        e4 = findViewById(R.id.dob);
        e5 = findViewById(R.id.maill);
        e6 = findViewById(R.id.fn);
        e7 = findViewById(R.id.mn);
        e8 = findViewById(R.id.ms);
        e9 = findViewById(R.id.nat);
        e10 = findViewById(R.id.lk);
        e11 = findViewById(R.id.hobies);
        e12 = findViewById(R.id.fatherphone);
        e13 = findViewById(R.id.motherphone);
        e14 = findViewById(R.id.gender);
        e15 = findViewById(R.id.gmail);

        b1 = findViewById(R.id.btn1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String fname1 = e1.getText().toString();
                String phn = e2.getText().toString();
                String add = e3.getText().toString();
                String dobb = e4.getText().toString();
                String maillll = e5.getText().toString();
                String fnn = e6.getText().toString();
                String mnn = e7.getText().toString();
                String mss = e8.getText().toString();
                String natt = e9.getText().toString();
                String lkk = e10.getText().toString();
                String hobiess = e11.getText().toString();
                String fatherphonee = e12.getText().toString();
                String motherphonee = e13.getText().toString();
                String genderr = e14.getText().toString();
                String gmaill = e15.getText().toString();

                // Start an intent to pick a photo from the device's file system
                Intent photoPickerIntent = new Intent(Intent.ACTION_GET_CONTENT);
                photoPickerIntent.setType("image/*");
                startActivityForResult(photoPickerIntent, 1);

                Bundle bundle = new Bundle();
                bundle.putString("name", fname1);
                bundle.putString("phone", phn);
                bundle.putString("address", add);
                bundle.putString("dob", dobb);
                bundle.putString("email", maillll);
                bundle.putString("fathername", fnn);
                bundle.putString("mothername", mnn);
                bundle.putString("martialstatus", mss);
                bundle.putString("nationality", natt);
                bundle.putString("languageknown", lkk);
                bundle.putString("hobies", hobiess);
                bundle.putString("fatherphone", fatherphonee);
                bundle.putString("motherphone", motherphonee);
                bundle.putString("gender", genderr);
                bundle.putString("gmail", gmaill);

                Intent intent = new Intent(getApplicationContext(), submitActivity.class);
                intent.putExtras(bundle);
                startActivity(intent);
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == 1 && resultCode == RESULT_OK) {
            if (data != null) {
                photoUri = data.getData();
            }
        }
    }
}