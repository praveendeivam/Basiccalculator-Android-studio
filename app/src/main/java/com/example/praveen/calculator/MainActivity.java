/*Hey Hi all , This is Basic Caluclator Application. You can perform four operations add,sub, mul, div
 Developed during my second year in CSE.
  */

package com.example.praveen.calculator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    Button btn_1,btn_2,btn_3,btn_4,btn_5,btn_6,btn_7,btn_8,btn_9,btn_0,btn_add,btn_sub,btn_div,btn_mul,btn_c,btn_ans,btn_d;
    EditText ed;
    float v1,v2;
    boolean add,sub,mul,div;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_0=(Button)findViewById(R.id.btn_0);
        btn_1=(Button)findViewById(R.id.btn_1);
        btn_2=(Button)findViewById(R.id.btn_2);
        btn_3=(Button)findViewById(R.id.btn_3);
        btn_4=(Button)findViewById(R.id.btn_4);
        btn_5=(Button)findViewById(R.id.btn_5);
        btn_6=(Button)findViewById(R.id.btn_6);
        btn_7=(Button)findViewById(R.id.btn_7);
        btn_8=(Button)findViewById(R.id.btn_8);
        btn_9=(Button)findViewById(R.id.btn_9);
        btn_add=(Button)findViewById(R.id.btn_add);
        btn_sub=(Button)findViewById(R.id.btn_sub);
        btn_mul=(Button)findViewById(R.id.btn_mul);
        btn_div=(Button)findViewById(R.id.btn_div);
        btn_c=(Button)findViewById(R.id.btn_c);
        btn_ans=(Button)findViewById(R.id.btn_ans);
        btn_d=(Button)findViewById(R.id.btn_d);
        ed=(EditText)findViewById(R.id.editText);


        btn_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ed.setText(ed.getText()+"0");
            }
        });

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"1");
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"2");
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"3");
            }
        });

        btn_4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"4");
            }
        });


        btn_5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"5");
            }
        });

        btn_6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"6");
            }
        });

        btn_7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"7");
            }
        });

        btn_8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"8");
            }
        });

        btn_9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+"9");
            }
        });

        btn_d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText(ed.getText()+".");
            }
        });


        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(ed==null)
                {
                    ed.setText("");
                }
                else
                {
                    v1=Float.parseFloat(ed.getText()+"");
                    add=true;
                    ed.setText(null);
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                     v1=Float.parseFloat(ed.getText()+"");
                     sub=true;
                     ed.setText(null);

            }
        });

        btn_mul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                     v1=Float.parseFloat(ed.getText()+"");
                     mul=true;
                     ed.setText(null);

            }
        });

        btn_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    v1=Float.parseFloat(ed.getText()+"");
                    div=true;
                    ed.setText(null);

            }
        });

        btn_ans.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                v2=Float.parseFloat(ed.getText()+"");
                if(add==true)
                {
                    ed.setText(v1+v2+"");
                    add=false;
                }

                if(sub==true)
                {
                    ed.setText(v1-v2+"");
                    sub=false;
                }
                if(mul==true)
                {
                    ed.setText(v1*v2+"");
                    mul=false;
                }
                if(div==true)
                {
                    ed.setText(v1/v2+"");
                    div=false;
                }
            }
        });

        btn_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ed.setText("");
            }
        });


    }
}
