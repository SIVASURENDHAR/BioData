// submitActivity.java

package com.example.personaldetails;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class submitActivity extends AppCompatActivity {

    TextView tv1, tv2, tv3, tv4, tv5, tv6, tv7, tv8, tv9, tv10, tv11, tv12, tv13, tv14, tv15;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_submit);

        tv1 = findViewById(R.id.t1);
        tv2 = findViewById(R.id.t2);
        tv3 = findViewById(R.id.t3);
        tv4 = findViewById(R.id.t4);
        tv5 = findViewById(R.id.t5);
        tv6 = findViewById(R.id.t6);
        tv7 = findViewById(R.id.t7);
        tv8 = findViewById(R.id.t8);
        tv9 = findViewById(R.id.t9);
        tv10 = findViewById(R.id.t10);
        tv11 = findViewById(R.id.t11);
        tv12 = findViewById(R.id.t12);
        tv13 = findViewById(R.id.t13);
        tv14 = findViewById(R.id.t14);
        tv15 = findViewById(R.id.t15);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String finameee = extras.getString("name");
            String phonenummm = extras.getString("phone");
            String addresss = extras.getString("address");
            String dobbb = extras.getString("dob");
            String mailll = extras.getString("email");
            String fathernameee = extras.getString("fathername");
            String mothernameee = extras.getString("mothername");
            String martialstatusss = extras.getString("martialstatus");
            String nationalityyy = extras.getString("nationality");
            String languageknownnn = extras.getString("languageknown");
            String hobies = extras.getString("hobies");
            String fatherphonee = extras.getString("fatherphone");
            String motherphonee = extras.getString("motherphone");
            String genderr = extras.getString("gender");
            String gmaill = extras.getString("gmail");
            String photoUriString = extras.getString("photoUri");

            // Set text values
            tv1.setText(finameee);
            tv2.setText(phonenummm);
            tv3.setText(addresss);
            tv4.setText(dobbb);
            tv5.setText(mailll);
            tv6.setText(fathernameee);
            tv7.setText(mothernameee);
            tv8.setText(martialstatusss);
            tv9.setText(nationalityyy);
            tv10.setText(languageknownnn);
            tv11.setText(hobies);
            tv12.setText(fatherphonee);
            tv13.setText(motherphonee);
            tv14.setText(genderr);
            tv15.setText(gmaill);

            // Set photo
            if (photoUriString != null) {
                Uri photoUri = Uri.parse(photoUriString);
                imageView.setImageURI(photoUri);
            }
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button nextButton = findViewById(R.id.button8);
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(submitActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Button button = findViewById(R.id.button9);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Show a toast message
                Toast.makeText(submitActivity.this, "Form downloaded successfully", Toast.LENGTH_SHORT).show();
            }
        });
    }
}