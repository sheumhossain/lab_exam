package com.example.my_calculaator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static java.lang.Math.sqrt;

public class MainActivity extends AppCompatActivity {
    private boolean ispressed = false;
    private double firstnum = 0;
    private int secondnumindex = 0;
    private char currentop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final TextView calculator_screen = findViewById(R.id.cal_screen);
        final Button n0 = findViewById(R.id.n0);
        final Button n1 = findViewById(R.id.n1);
        final Button n2 = findViewById(R.id.n2);
        final Button n3 = findViewById(R.id.n3);
        final Button n4 = findViewById(R.id.n4);
        final Button n5 = findViewById(R.id.n5);
        final Button n6 = findViewById(R.id.n6);
        final Button n7 = findViewById(R.id.n7);
        final Button n8 = findViewById(R.id.n8);
        final Button n9 = findViewById(R.id.n9);
        final Button dot = findViewById(R.id.dot);
        final Button equal = findViewById(R.id.equal);
        final Button addition = findViewById(R.id.addition);
        final Button subtraction = findViewById(R.id.subtraction);
        final Button multiplication = findViewById(R.id.multiplication);
        final Button division = findViewById(R.id.division);
        final Button square = findViewById(R.id.sqr);
        final Button modulas = findViewById(R.id.mod);
        final Button root = findViewById(R.id.root);

        final View.OnClickListener calculatorListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               final int id = v.getId();
               switch (id){
                   case R.id.n0 :
                       calculator_screen.append("0");
                       break;

                   case R.id.n1 :
                       calculator_screen.append("1");
                       break;

                   case R.id.n2:
                       calculator_screen.append("2");
                       break;

                   case R.id.n3 :
                       calculator_screen.append("3");
                       break;

                   case R.id.n4 :
                       calculator_screen.append("4");
                       break;

                   case R.id.n5 :
                       calculator_screen.append("5");
                       break;

                   case R.id.n6 :
                       calculator_screen.append("6");
                       break;

                   case R.id.n7 :
                       calculator_screen.append("7");
                       break;

                   case R.id.n8 :
                       calculator_screen.append("8");
                       break;


                   case R.id.n9 :
                       calculator_screen.append("9");
                       break;

                   case R.id.dot :
                       calculator_screen.append("0");
                       break;

                   case R.id.equal :
                       if (ispressed){
                           if (currentop == '+'){
                               String screencontent = calculator_screen.getText().toString();
                               double secondnum = Double.parseDouble(screencontent.
                                       substring(secondnumindex,screencontent.length()));
                               secondnum+=firstnum;
                               calculator_screen.setText(String.valueOf(secondnum));
                           }

                       }

                       if (ispressed){
                           if (currentop == '-'){
                               String screencontent = calculator_screen.getText().toString();
                               double secondnum = Double.parseDouble(screencontent.
                                       substring(secondnumindex,screencontent.length()));
                               secondnum=firstnum-secondnum;
                               calculator_screen.setText(String.valueOf(secondnum));
                           }

                       }

                       if (ispressed){
                           if (currentop == '*'){
                               String screencontent = calculator_screen.getText().toString();
                               double secondnum = Double.parseDouble(screencontent.
                                       substring(secondnumindex,screencontent.length()));
                               secondnum=firstnum*secondnum;
                               calculator_screen.setText(String.valueOf(secondnum));
                           }

                       }


                       if (ispressed){
                           if (currentop == '/'){
                               String screencontent = calculator_screen.getText().toString();
                               double secondnum = Double.parseDouble(screencontent.
                                       substring(secondnumindex,screencontent.length()));
                               secondnum=firstnum/secondnum;
                               calculator_screen.setText(String.valueOf(secondnum));
                           }

                       }


                   if (ispressed){
                       if (currentop == '^'){
                           firstnum = firstnum*firstnum;
                           calculator_screen.setText(String.valueOf(firstnum));
                       }

                   }

                   if (ispressed){
                       if (currentop == '%'){
                           String screencontent = calculator_screen.getText().toString();
                           double secondnum = Double.parseDouble(screencontent.
                                   substring(secondnumindex,screencontent.length()));
                           secondnum=firstnum%secondnum;
                           calculator_screen.setText(String.valueOf(secondnum));
                       }

                   }

                   if (ispressed){
                       if (currentop == 'R'){
                           firstnum = sqrt(firstnum);
                           calculator_screen.setText(String.valueOf(firstnum));
                       }
                   }

                   break;
                   case R.id.addition :
                       String screencontent = calculator_screen.getText().toString();
                       secondnumindex = screencontent.length()+1;
                       firstnum = Double.parseDouble(calculator_screen.getText().toString());
                       calculator_screen.append("+");
                       ispressed = true;
                       currentop = '+';
                       break;

                   case R.id.subtraction :
                       String screencontent1 = calculator_screen.getText().toString();
                       secondnumindex = screencontent1.length()+1;
                       firstnum = Double.parseDouble(calculator_screen.getText().toString());
                       calculator_screen.append("-");
                       ispressed = true;
                       currentop = '-';
                       break;

                   case R.id.multiplication :
                       String screencontent2 = calculator_screen.getText().toString();
                       secondnumindex = screencontent2.length()+1;
                       firstnum = Double.parseDouble(calculator_screen.getText().toString());
                       calculator_screen.append("*");
                       ispressed = true;
                       currentop = '*';
                       break;

                   case R.id.division :
                       String screencontent3 = calculator_screen.getText().toString();
                       secondnumindex = screencontent3.length()+1;
                       firstnum = Double.parseDouble(calculator_screen.getText().toString());
                       calculator_screen.append("/");
                       ispressed = true;
                       currentop = '/';
                       break;

                   case R.id.sqr :
                       String screencontent4 = calculator_screen.getText().toString();
                       firstnum = Double.parseDouble(calculator_screen.getText().toString());
                       calculator_screen.append("^");
                       ispressed = true;
                       currentop = '^';
                       break;
                   case R.id.mod :
                       String screencontent5 = calculator_screen.getText().toString();
                       secondnumindex = screencontent5.length()+1;
                       firstnum = Double.parseDouble(calculator_screen.getText().toString());
                       calculator_screen.append("%");
                       ispressed = true;
                       currentop = '%';
                       break;

                   case R.id.root:
                       String screencontent6 = calculator_screen.getText().toString();
                       firstnum = Double.parseDouble(calculator_screen.getText().toString());
                       ispressed = true;
                       currentop = 'R';

                       break;

               }
            }
        };
        n0.setOnClickListener(calculatorListener);
        n1.setOnClickListener(calculatorListener);
        n2.setOnClickListener(calculatorListener);
        n3.setOnClickListener(calculatorListener);
        n4.setOnClickListener(calculatorListener);
        n5.setOnClickListener(calculatorListener);
        n6.setOnClickListener(calculatorListener);
        n7.setOnClickListener(calculatorListener);
        n8.setOnClickListener(calculatorListener);
        n9.setOnClickListener(calculatorListener);
        dot.setOnClickListener(calculatorListener);
        equal.setOnClickListener(calculatorListener);
        addition.setOnClickListener(calculatorListener);
        subtraction.setOnClickListener(calculatorListener);
        multiplication.setOnClickListener(calculatorListener);
        division.setOnClickListener(calculatorListener);
        square.setOnClickListener(calculatorListener);
        modulas.setOnClickListener(calculatorListener);
        root.setOnClickListener(calculatorListener);

        final Button delete = findViewById(R.id.del);
        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String displayelements = calculator_screen.getText().toString();
                int len = displayelements.length();
                if(len>0){
                    displayelements = displayelements.substring(0,len-1);
                    calculator_screen.setText(displayelements);
                }
            }
        });
        final Button clear = findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                calculator_screen.setText("");
            }
        });
    }
}
