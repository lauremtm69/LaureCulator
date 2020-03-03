package com.alenmutum21.calctry;

import androidx.appcompat.app.AppCompatActivity;

import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button one, two, three, four,five,six,seven,eight,nine,zero;
    private Button x,equals,add,div,sub,Ac;
    private TextView displayText;
    private String modelInt = "";
    private String firstNo = "0";
    private String secondNo = "0";
    private int addCount;
    private boolean firstFinish = false;
    private boolean isSum,isMult,isDiv,isSub;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initFields();
        clearScreen();
        resultMethod();
        onClickContext();
    }

    private void onClickContext() {
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        x.setOnClickListener(this);
        add.setOnClickListener(this);
        div.setOnClickListener(this);
        sub.setOnClickListener(this);
    }

    private void resultMethod() {
        equals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(isMult){
                    Double value = Double.parseDouble(firstNo) * Double.parseDouble(secondNo);
                    Toast.makeText(MainActivity.this, value +"", Toast.LENGTH_SHORT).show();
                    displayText.setText(value + "");
                    modelInt = "";
                    secondNo = "0";
                    firstFinish = false;
                    isMult = false;
                    firstNo = String.valueOf(value);
                }else  if (isSum){
//                    if (addCount > 1){
//                        secondNo = "0";
//                    }
                    Double value = Double.parseDouble(firstNo) + Double.parseDouble(secondNo);
                    Toast.makeText(MainActivity.this, value +"", Toast.LENGTH_SHORT).show();
                    displayText.setText(value + "");
                    modelInt = "";
                    secondNo = "0";
                    firstFinish = false;
                    isSum = false;
                    firstNo = String.valueOf(value);
                    addCount = 0;
                }
                else if (isSub){
                    Double value = Double.parseDouble(firstNo) - Double.parseDouble(secondNo);
                    Toast.makeText(MainActivity.this, value +"", Toast.LENGTH_SHORT).show();
                    displayText.setText(value + "");
                    modelInt = "";
                    secondNo = "0";
                    firstFinish = false;
                    isSub = false;
                    firstNo = String.valueOf(value);
                }else  if(isDiv){
                    Double value = Double.parseDouble(firstNo) / Double.parseDouble(secondNo);
                    Toast.makeText(MainActivity.this, value +"", Toast.LENGTH_SHORT).show();
                    displayText.setText(value + "");
                    modelInt = "";
                    secondNo = "0";
                    firstFinish = false;
                    isDiv = false;
                    firstNo = String.valueOf(value);
                }
            }
        });
    }

    private void clearScreen() {
        Ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                firstNo = "0";
                secondNo = "0";
                modelInt = "";
                displayText.setText("");
                firstFinish = false;
                isMult = false;
                isDiv = false;
                isSub = false;
                isSum = false;
            }
        });
    }

    private void initFields() {
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        zero = findViewById(R.id.zero);
        displayText = findViewById(R.id.display);
        x = findViewById(R.id.x);
        equals = findViewById(R.id.equals);
        Ac = findViewById(R.id.clear);
        add = findViewById(R.id.add);
        div = findViewById(R.id.div);
        sub = findViewById(R.id.sub);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.one:
                if(firstFinish == true){
                    modelInt = modelInt + "1";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else {
                modelInt = modelInt + "1";
                firstNo = modelInt ;
                displayText.setText(modelInt);
                break;}

            case R.id.two:
                if(firstFinish == true){
                    modelInt = modelInt + "2";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else{
                    modelInt = modelInt + "2";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }

            case R.id.three:
                if(firstFinish == true){
                    modelInt = modelInt + "3";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else{
                    modelInt = modelInt + "3";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }

            case R.id.four:
                if(firstFinish == true){
                    modelInt = modelInt + "4";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else{
                    modelInt = modelInt + "4";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }

            case R.id.five:
                if(firstFinish == true){
                    modelInt = modelInt + "5";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else {
                    modelInt = modelInt + "5";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;}

            case R.id.six:
                if(firstFinish == true){
                    modelInt = modelInt + "6";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else{
                    modelInt = modelInt + "6";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }

            case R.id.seven:
                if(firstFinish == true){
                    modelInt = modelInt + "7";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else{
                    modelInt = modelInt + "7";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }

            case R.id.eight:
                if(firstFinish == true){
                    modelInt = modelInt + "8";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else{
                    modelInt = modelInt + "8";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }

            case R.id.nine:
                if(firstFinish == true){
                    modelInt = modelInt + "9";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else{
                    modelInt = modelInt + "9";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }

            case R.id.zero:
                if(firstFinish == true){
                    modelInt = modelInt + "0";
                    secondNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }else{
                    modelInt = modelInt + "0";
                    firstNo = modelInt ;
                    displayText.setText(modelInt);
                    break;
                }



            case R.id.x:
                modelInt = "";
                Toast.makeText(this, "product", Toast.LENGTH_SHORT).show();
                firstFinish = true;
                isMult = true;
                break;

            case R.id.add:
                addCount++;
                modelInt = "";
                double value = Double.parseDouble(firstNo) + Double.parseDouble(secondNo);
                firstNo = value + "";
                displayText.setText(value + "");
                Toast.makeText(this, "add", Toast.LENGTH_SHORT).show();
                firstFinish = true;
                isSum = true;
                break;

            case R.id.sub:
                modelInt = "";
                Toast.makeText(this, "subtract", Toast.LENGTH_SHORT).show();
                firstFinish = true;
                isSub = true;
                break;

            case R.id.div:
                modelInt = "";
                Toast.makeText(this, "division", Toast.LENGTH_SHORT).show();
                firstFinish = true;
                isDiv = true;
                break;
        }
    }

}



