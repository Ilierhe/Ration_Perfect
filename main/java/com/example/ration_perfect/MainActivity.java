package com.example.ration_perfect;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText age;
    EditText height;
    EditText weight;
    RadioGroup rg;
    RadioButton rbm;
    RadioButton rbf;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        age=findViewById(R.id.editText1);
        height=findViewById(R.id.editText2);
        weight=findViewById(R.id.editText3);
        rbm=findViewById(R.id.radioButton1);
        rbf=findViewById(R.id.radioButton2);
        rg=findViewById(R.id.rg);

        rg.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                RadioButton rb=(RadioButton)findViewById(checkedId);
                Toast.makeText(getApplicationContext(), rb.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    public void nextPage(View view){

        if (age.getText().toString().equals("")
                || height.getText().toString().equals("")
                || weight.getText().toString().equals("")){
            Toast.makeText(this, "Вы ввели не все данные", Toast.LENGTH_LONG).show();
        }
        else if (Integer.parseInt(age.getText().toString())<5 || Integer.parseInt(age.getText().toString())>100) {
            Toast.makeText(this, "Нет такого возраста", Toast.LENGTH_LONG).show();
        }
        else if (Integer.parseInt(height.getText().toString())<140 || Integer.parseInt(height.getText().toString())>250) {
            Toast.makeText(this, "Нет такого роста", Toast.LENGTH_LONG).show();
        }
        else if (Integer.parseInt(weight.getText().toString())<30 || Integer.parseInt(weight.getText().toString())>150) {
            Toast.makeText(this, "Вам стоит обратиться к профессиональному диетологу", Toast.LENGTH_LONG).show();
        }
        else if (!rbm.isChecked() && !rbf.isChecked()){
            Toast.makeText(this, "Вы не выбрали пол", Toast.LENGTH_LONG).show();
        }
        else if (!rbf.isChecked()){
            double a,w,h;
            double r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13;
            String s1 = age.getText().toString();
            String s2 = height.getText().toString();
            String s3 = weight.getText().toString();
            a = Double.parseDouble(s1);
            w = Double.parseDouble(s2);
            h = Double.parseDouble(s3);

            r1=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 11/89);
            r2=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 7/101);
            r3=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 11.5/305);
            r4=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 6.5/170);
            r5=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 4/35);
            r6=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 11.5/346);
            r7=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 7.5/137);
            r8=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 3/52);
            r9=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 9/160);
            r10=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 4/40);
            r11=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 10/167);
            r12=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 5/103);
            r13=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7) * 10/72);

            String rp1 = Double.toString(r1);
            String rp2 = Double.toString(r2);
            String rp3 = Double.toString(r3);
            String rp4 = Double.toString(r4);
            String rp5 = Double.toString(r5);
            String rp6 = Double.toString(r6);
            String rp7 = Double.toString(r7);
            String rp8 = Double.toString(r8);
            String rp9 = Double.toString(r9);
            String rp10 = Double.toString(r10);
            String rp11 = Double.toString(r11);
            String rp12 = Double.toString(r12);
            String rp13 = Double.toString(r13);

            Intent intent = (new Intent(this, SecondActivity.class));
            intent.putExtra("p1", rp1);
            intent.putExtra("p2", rp2);
            intent.putExtra("p3", rp3);
            intent.putExtra("p4", rp4);
            intent.putExtra("p5", rp5);
            intent.putExtra("p6", rp6);
            intent.putExtra("p7", rp7);
            intent.putExtra("p8", rp8);
            intent.putExtra("p9", rp9);
            intent.putExtra("p10", rp10);
            intent.putExtra("p11", rp11);
            intent.putExtra("p12", rp12);
            intent.putExtra("p13", rp13);
            startActivity(intent);
        }
        else {
            double a,w,h;
            double r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13;
            String s1 = age.getText().toString();
            String s2 = height.getText().toString();
            String s3 = weight.getText().toString();
            a = Double.parseDouble(s1);
            w = Double.parseDouble(s2);
            h = Double.parseDouble(s3);

            r1=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 11/89);
            r2=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 7/101);
            r3=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 11.5/305);
            r4=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 6.5/170);
            r5=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 4/35);
            r6=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 11.5/346);
            r7=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 7.5/137);
            r8=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 3/52);
            r9=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 9/160);
            r10=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 4/40);
            r11=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 10/167);
            r12=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 5/103);
            r13=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3) * 10/72);

            String rp1 = Double.toString(r1);
            String rp2 = Double.toString(r2);
            String rp3 = Double.toString(r3);
            String rp4 = Double.toString(r4);
            String rp5 = Double.toString(r5);
            String rp6 = Double.toString(r6);
            String rp7 = Double.toString(r7);
            String rp8 = Double.toString(r8);
            String rp9 = Double.toString(r9);
            String rp10 = Double.toString(r10);
            String rp11 = Double.toString(r11);
            String rp12 = Double.toString(r12);
            String rp13 = Double.toString(r13);

            Intent intent = (new Intent(this, SecondActivity.class));
            intent.putExtra("p1", rp1);
            intent.putExtra("p2", rp2);
            intent.putExtra("p3", rp3);
            intent.putExtra("p4", rp4);
            intent.putExtra("p5", rp5);
            intent.putExtra("p6", rp6);
            intent.putExtra("p7", rp7);
            intent.putExtra("p8", rp8);
            intent.putExtra("p9", rp9);
            intent.putExtra("p10", rp10);
            intent.putExtra("p11", rp11);
            intent.putExtra("p12", rp12);
            intent.putExtra("p13", rp13);
            startActivity(intent);
        }

    }

    public void nextPage2(View view){

        if (age.getText().toString().equals("")
                || height.getText().toString().equals("")
                || weight.getText().toString().equals("")){
            Toast.makeText(this, "Вы ввели не все данные", Toast.LENGTH_LONG).show();
        }
        else if (!rbm.isChecked() && !rbf.isChecked()){
            Toast.makeText(this, "Вы не выбрали пол", Toast.LENGTH_LONG).show();
        }
        else if (!rbf.isChecked()){
            double a,w,h;
            double r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13;
            String s1 = age.getText().toString();
            String s2 = height.getText().toString();
            String s3 = weight.getText().toString();
            a = Double.parseDouble(s1);
            w = Double.parseDouble(s2);
            h = Double.parseDouble(s3);

            r1=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 11/89);
            r2=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 7/101);
            r3=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 11.5/305);
            r4=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 6.5/170);
            r5=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 4/35);
            r6=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 11.5/346);
            r7=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 7.5/137);
            r8=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 3/52);
            r9=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 9/160);
            r10=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 4/40);
            r11=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 10/167);
            r12=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 5/103);
            r13=Math.ceil((88.36 + 13.4 * h + w * 4.8 -  a * 5.7 - 500) * 10/72);

            String rp1 = Double.toString(r1);
            String rp2 = Double.toString(r2);
            String rp3 = Double.toString(r3);
            String rp4 = Double.toString(r4);
            String rp5 = Double.toString(r5);
            String rp6 = Double.toString(r6);
            String rp7 = Double.toString(r7);
            String rp8 = Double.toString(r8);
            String rp9 = Double.toString(r9);
            String rp10 = Double.toString(r10);
            String rp11 = Double.toString(r11);
            String rp12 = Double.toString(r12);
            String rp13 = Double.toString(r13);

            Intent intent = (new Intent(this, SecondActivity.class));
            intent.putExtra("p1", rp1);
            intent.putExtra("p2", rp2);
            intent.putExtra("p3", rp3);
            intent.putExtra("p4", rp4);
            intent.putExtra("p5", rp5);
            intent.putExtra("p6", rp6);
            intent.putExtra("p7", rp7);
            intent.putExtra("p8", rp8);
            intent.putExtra("p9", rp9);
            intent.putExtra("p10", rp10);
            intent.putExtra("p11", rp11);
            intent.putExtra("p12", rp12);
            intent.putExtra("p13", rp13);
            startActivity(intent);
        }
        else {
            double a,w,h;
            double r1,r2,r3,r4,r5,r6,r7,r8,r9,r10,r11,r12,r13;
            String s1 = age.getText().toString();
            String s2 = height.getText().toString();
            String s3 = weight.getText().toString();
            a = Double.parseDouble(s1);
            w = Double.parseDouble(s2);
            h = Double.parseDouble(s3);

            r1=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 11/89);
            r2=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 7/101);
            r3=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 11.5/305);
            r4=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 6.5/170);
            r5=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 4/35);
            r6=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 11.5/346);
            r7=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 7.5/137);
            r8=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 3/52);
            r9=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 9/160);
            r10=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 4/40);
            r11=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 10/167);
            r12=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 5/103);
            r13=Math.ceil((447.6 + 9.2 * h + w * 3.1 -  a * 4.3 - 500) * 10/72);

            String rp1 = Double.toString(r1);
            String rp2 = Double.toString(r2);
            String rp3 = Double.toString(r3);
            String rp4 = Double.toString(r4);
            String rp5 = Double.toString(r5);
            String rp6 = Double.toString(r6);
            String rp7 = Double.toString(r7);
            String rp8 = Double.toString(r8);
            String rp9 = Double.toString(r9);
            String rp10 = Double.toString(r10);
            String rp11 = Double.toString(r11);
            String rp12 = Double.toString(r12);
            String rp13 = Double.toString(r13);

            Intent intent = (new Intent(this, SecondActivity.class));
            intent.putExtra("p1", rp1);
            intent.putExtra("p2", rp2);
            intent.putExtra("p3", rp3);
            intent.putExtra("p4", rp4);
            intent.putExtra("p5", rp5);
            intent.putExtra("p6", rp6);
            intent.putExtra("p7", rp7);
            intent.putExtra("p8", rp8);
            intent.putExtra("p9", rp9);
            intent.putExtra("p10", rp10);
            intent.putExtra("p11", rp11);
            intent.putExtra("p12", rp12);
            intent.putExtra("p13", rp13);
            startActivity(intent);
        }

    }
}