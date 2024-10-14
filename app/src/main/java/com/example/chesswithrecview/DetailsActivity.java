package com.example.chesswithrecview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailsActivity extends AppCompatActivity {
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        String[] st=getResources().getStringArray(R.array.details);
        Intent intent=getIntent();
        int index=intent.getIntExtra("ItemId",0);
        textView=findViewById(R.id.textView);
        textView.setText(textView.getText().toString()+st[index]);
       //if (index==0){textView.setText(textView.getText().toString()+"تأخر العلماء في اكتشاف كوكب عطارد، وذلك بسبب موقعه، إذ إنه قريبٌ من الأفق الغربي، وبالتالي فإنّ الغلاف الجوي يعمل على امتصاص الضوء الصادر عنه، هذا عدا عن أنّ الشفق الذي يظهر في فترة الغروب يساهم في إخفائه، الأمر الذي يجعل من الصعب رصده، ولكن يشار إلى أنّ أوّل معلومات حصل عليها الفلكيين عن هذا الكوكب كانت في العام 1974م، وذلك عندما توجّهت المركبة الفضائية الأمريكية مارينر إلى سطحه لدراسته، وفي هذا المقال سنعرفكم على مجموعةٍ من المعلومات عن كوكب عطارد." );}
       //if (index==1){textView.setText(textView.getText().toString()+"معلومات الزهرة" );}
        //if (index==2){textView.setText(textView.getText().toString()+"معلومات الارض" );}
        //if (index==3){textView.setText(textView.getText().toString()+"معلومات المريخ" );}
        //if (index==4){textView.setText(textView.getText().toString()+"معلومات المشتري" );}
        //if (index==5){textView.setText(textView.getText().toString()+"معلومات زحل" );}
    }
}
