package com.example.quiz;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.PopupWindow;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class ChemistryActivity extends AppCompatActivity {

    String doBetter = "You can do better!" + System.getProperty("line.separator") + System.getProperty("line.separator") + "Try again?";
    String poor = "Brush up your knowledge, maybe?";
    String congrats = "Well done!" + System.getProperty("line.separator") + "You are awesome!";
    RadioButton question1_choice1;
    RadioButton question1_choice2;
    RadioButton question1_choice3;
    RadioButton question1_choice4;
    RadioButton question2_choice1;
    RadioButton question2_choice2;
    RadioButton question2_choice3;
    RadioButton question2_choice4;
    CheckBox question3_choice1;
    CheckBox question3_choice2;
    CheckBox question3_choice3;
    CheckBox question3_choice4;
    EditText question4_answer;
    CheckBox question5_choice1;
    CheckBox question5_choice2;
    CheckBox question5_choice3;
    CheckBox question5_choice4;
    EditText question6_answer;
    RadioButton question7_choice1;
    RadioButton question7_choice2;
    RadioButton question7_choice3;
    RadioButton question7_choice4;
    EditText question8_answer;
    RadioButton question9_choice1;
    RadioButton question9_choice2;
    RadioButton question9_choice3;
    RadioButton question9_choice4;
    RadioButton question10_choice1;
    RadioButton question10_choice2;
    RadioButton question10_choice3;
    RadioButton question10_choice4;
    int final_score = 0;
    private Boolean isFabOpen = false;
    private FloatingActionButton fab, fab1, fab2;
    private Animation fab_open, fab_close, rotate_forward, rotate_backward;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chemistry);
        fab = findViewById(R.id.fab);
        fab1 = findViewById(R.id.fab1);
        fab2 = findViewById(R.id.fab2);
        question1_choice1 = findViewById(R.id.question1_choice1);
        question1_choice2 = findViewById(R.id.question1_choice2);
        question1_choice3 = findViewById(R.id.question1_choice3);
        question1_choice4 = findViewById(R.id.question1_choice4);
        question2_choice1 = findViewById(R.id.question2_choice1);
        question2_choice2 = findViewById(R.id.question2_choice2);
        question2_choice3 = findViewById(R.id.question2_choice3);
        question2_choice4 = findViewById(R.id.question2_choice4);
        question3_choice1 = findViewById(R.id.question3_choice1);
        question3_choice2 = findViewById(R.id.question3_choice2);
        question3_choice3 = findViewById(R.id.question3_choice3);
        question3_choice4 = findViewById(R.id.question3_choice4);
        question4_answer = findViewById(R.id.question4_answer);
        question5_choice1 = findViewById(R.id.question5_choice1);
        question5_choice2 = findViewById(R.id.question5_choice2);
        question5_choice3 = findViewById(R.id.question5_choice3);
        question5_choice4 = findViewById(R.id.question5_choice4);
        question6_answer = findViewById(R.id.question6_answer);
        question7_choice1 = findViewById(R.id.question7_choice1);
        question7_choice2 = findViewById(R.id.question7_choice2);
        question7_choice3 = findViewById(R.id.question7_choice3);
        question7_choice4 = findViewById(R.id.question7_choice4);
        question8_answer = findViewById(R.id.question8_answer);
        question9_choice1 = findViewById(R.id.question9_choice1);
        question9_choice2 = findViewById(R.id.question9_choice2);
        question9_choice3 = findViewById(R.id.question9_choice3);
        question9_choice4 = findViewById(R.id.question9_choice4);
        question10_choice1 = findViewById(R.id.question10_choice1);
        question10_choice2 = findViewById(R.id.question10_choice2);
        question10_choice3 = findViewById(R.id.question10_choice3);
        question10_choice4 = findViewById(R.id.question10_choice4);
        ScrollView view = findViewById(R.id.scroll_view);
        view.setDescendantFocusability(ViewGroup.FOCUS_BEFORE_DESCENDANTS);
        view.setFocusable(true);
        view.setFocusableInTouchMode(true);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                v.requestFocusFromTouch();
                return false;
            }
        });
        fab_open = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_open);
        fab_close = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fab_close);
        rotate_forward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_forward);
        rotate_backward = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.rotate_backward);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (isFabOpen) {
                    fab.startAnimation(rotate_backward);
                    fab1.startAnimation(fab_close);
                    fab2.startAnimation(fab_close);
                    fab1.setClickable(false);
                    fab2.setClickable(false);
                    isFabOpen = false;
                } else {

                    fab.startAnimation(rotate_forward);
                    fab1.startAnimation(fab_open);
                    fab2.startAnimation(fab_open);
                    fab1.setClickable(true);
                    fab2.setClickable(true);
                    isFabOpen = true;
                }
            }
        });
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (question1_choice1.isChecked())
                    final_score++;
                if (question2_choice2.isChecked())
                    final_score++;
                if (question3_choice1.isChecked() && question3_choice2.isChecked() && question3_choice3.isChecked() && question3_choice4.isChecked())
                    final_score++;
                if (question4_answer.getText().toString().toLowerCase().equals("google"))
                    final_score++;
                if (question5_choice1.isChecked() && question5_choice2.isChecked() && question5_choice3.isChecked())
                    final_score++;
                if (question6_answer.getText().toString().toLowerCase().equals("android package kit"))
                    final_score++;
                if (question7_choice1.isChecked())
                    final_score++;
                if (question8_answer.getText().toString().toLowerCase().equals("android debug bridge"))
                    final_score++;
                if (question9_choice4.isChecked())
                    final_score++;
                if (question10_choice4.isChecked())
                    final_score++;
                LayoutInflater inflater = (LayoutInflater) ChemistryActivity.this.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.popup, null);
                if (final_score <= 3) {
                    ((TextView) layout.findViewById(R.id.popup)).setText(poor);
                } else if (final_score >= 4 && final_score <= 9) {
                    ((TextView) layout.findViewById(R.id.popup)).setText(doBetter);
                } else {
                    ((TextView) layout.findViewById(R.id.popup)).setText(congrats);
                }
                float density = ChemistryActivity.this.getResources().getDisplayMetrics().density;
                final PopupWindow pw = new PopupWindow(layout, (int) density * 350, (int) density * 400, true);
                pw.setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
                pw.setTouchInterceptor(new View.OnTouchListener() {
                    public boolean onTouch(View v, MotionEvent event) {
                        if (event.getAction() == MotionEvent.ACTION_OUTSIDE) {
                            pw.dismiss();
                            return true;
                        }
                        return false;
                    }
                });
                pw.setOutsideTouchable(true);
                pw.showAtLocation(layout, Gravity.CENTER, 0, 0);
                Context context = getApplicationContext();
                CharSequence text = "Your Score: " + final_score;
                int duration = Toast.LENGTH_LONG;
                Toast toast = Toast.makeText(context, text, duration);
                toast.show();
            }
        });
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (question1_choice1.isChecked() || question1_choice2.isChecked() || question1_choice3.isChecked() || question1_choice4.isChecked() || question2_choice1.isChecked() || question2_choice2.isChecked() || question2_choice3.isChecked() || question2_choice4.isChecked() || question3_choice1.isChecked() || question3_choice2.isChecked() || question3_choice3.isChecked() || question3_choice4.isChecked() || !question4_answer.getText().toString().equals("") || question5_choice1.isChecked() || question5_choice2.isChecked() || question5_choice3.isChecked() || question5_choice4.isChecked() || !question6_answer.getText().toString().equals("") || question7_choice1.isChecked() || question7_choice2.isChecked() || question7_choice3.isChecked() || question7_choice4.isChecked() || !question8_answer.getText().toString().equals("") || question9_choice1.isChecked() || question9_choice2.isChecked() || question9_choice3.isChecked() || question9_choice4.isChecked() || question10_choice1.isChecked() || question10_choice2.isChecked() || question10_choice3.isChecked() || question10_choice4.isChecked()) {
                    RadioGroup radioGroup1 = findViewById(R.id.radiogroup1);
                    radioGroup1.clearCheck();
                    RadioGroup radioGroup2 = findViewById(R.id.radiogroup2);
                    radioGroup2.clearCheck();
                    question3_choice1.setChecked(false);
                    question3_choice2.setChecked(false);
                    question3_choice3.setChecked(false);
                    question3_choice4.setChecked(false);
                    question4_answer.setText(null);
                    question5_choice1.setChecked(false);
                    question5_choice2.setChecked(false);
                    question5_choice3.setChecked(false);
                    question5_choice4.setChecked(false);
                    question6_answer.setText(null);
                    RadioGroup radioGroup4 = findViewById(R.id.radiogroup7);
                    radioGroup4.clearCheck();
                    question8_answer.setText(null);
                    RadioGroup radioGroup5 = findViewById(R.id.radiogroup9);
                    radioGroup5.clearCheck();
                    RadioGroup radioGroup6 = findViewById(R.id.radiogroup10);
                    radioGroup6.clearCheck();
                    final_score = 0;
                    Toast.makeText(ChemistryActivity.this, "Answers reset", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}