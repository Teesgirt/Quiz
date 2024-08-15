package com.example.quiz;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

public class MainActivity extends AppCompatActivity {
    TextView v,v2;
    CardView j,j2,j3,j4,j5;
    ConstraintLayout k;
    ImageView m;
    LinearLayout l;
    SQLiteDatabase sd;
    Cursor c;
    EditText name,email,Phoneno,clas;
    AwesomeValidation awe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        clas=findViewById(R.id.e2);
        name=findViewById(R.id.e1);
        email=findViewById(R.id.e4);
        Phoneno=findViewById(R.id.e3);
        j=findViewById(R.id.cardView);
        j2=findViewById(R.id.cardView2);
        j3=findViewById(R.id.cardView3);
        j4=findViewById(R.id.cardView4);
        j5=findViewById(R.id.cardView5);
        v=findViewById(R.id.textView);
        v2=findViewById(R.id.textView2);
        k=findViewById(R.id.register_layout);
        l=findViewById(R.id.linearLayout);
        m=findViewById(R.id.Line);
        awe=new AwesomeValidation(ValidationStyle.BASIC);
        Animation animation=
                AnimationUtils.loadAnimation(getApplicationContext(),R.anim.fade_in);
        Animation animation1=
                AnimationUtils.loadAnimation(getApplicationContext(),R.anim.bottom_down);
        awe.addValidation(this,R.id.e4, Patterns.EMAIL_ADDRESS,R.string.invalid_email);
        awe.addValidation(this,R.id.e3, Patterns.PHONE,R.string.invalid_phone);
        awe.addValidation(this,R.id.e1,
                RegexTemplate.NOT_EMPTY,R.string.invalid_username);
        l.startAnimation(animation1);
        k.startAnimation(animation);

        final Handler handler = new Handler();
        m.startAnimation(animation);
        j.startAnimation(animation);
        j2.startAnimation(animation);
        j3.startAnimation(animation);
        j4.startAnimation(animation);
        j5.startAnimation(animation);
        v.startAnimation(animation);
        v2.startAnimation(animation);


        final Runnable r = new Runnable() {

            public void run() {
                handler.postDelayed(this, 1000);

            }


        };
        k.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try{
                    sd=openOrCreateDatabase("StudentInfo",0,null);
                    sd.execSQL("Create table stud_contacts(name text,email text,phoneno text)");
                }
                catch (SQLException se)
                {
                    Log.d("DatabaseCreation Error","Error Msg"+se);

                }
                k.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        ContentValues cv=new ContentValues();
                        cv.put("Name",name.getText().toString());

                        cv.put("Phoneno",Phoneno.getText().toString());
                        cv.put("Email",email.getText().toString());
                        if(awe.validate() && sd.insert("stud_contacts",null,cv)!=-1)
                        {


                            Toast.makeText(getApplicationContext(),"login Successful",Toast.LENGTH_LONG).show();
                            Toast.makeText(getApplicationContext(),"Record Inserted Successfully",Toast.LENGTH_LONG).show();
                            Intent tent = new Intent(MainActivity.this, Go.class);
                            // Start the new activity
                            startActivity(tent);
                        }
                        else
                        {
                            Toast.makeText(getApplicationContext(),"Login Unsuccessful....Try Again----",Toast.LENGTH_LONG).show();
                            Toast.makeText(getApplicationContext(),"Error in Inserting Record",Toast.LENGTH_LONG).show();
                        }

                    }
                });


            }
        });

    }
}