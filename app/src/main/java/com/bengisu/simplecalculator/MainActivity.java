package com.bengisu.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
//eğer bir görünüm tanımlayacaksak burda tanımlayıp oncreate altında findviwını yapmak bütün
// methodlarda kullamak için kapı açar
    EditText number1Text;
    EditText number2Text;
    TextView resultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ne yazdığını anlamak için id isimlriyle obje isimlerini aynı yaparsan iyi olur
        number1Text = findViewById(R.id.number1Text);
        number2Text = findViewById(R.id.number2Text);
        resultText = findViewById(R.id.resultText);


    }
    public void sum(View view){

        if (number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("") ){
            resultText.setText("Enter number!");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result=number1+number2;

            resultText.setText("Result: "+result);
            //direkt result(int) yazamayız çalıştırnca çöker,setText string istiyo o yüzden önce metinle
            // başlarsak direkt stringe cevirmis oluruz
        }


    }
    public void deduct(View view){
        if (number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("") ){
            resultText.setText("Enter number!");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result=number1-number2;

            resultText.setText("Result: "+result);
            //direkt result(int) yazamayız çalıştırnca çöker,setText string istiyo o yüzden önce metinle
            // başlarsak direkt stringe cevirmis oluruz
        }
    }
    public void multiply(View view){
        if (number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("") ){
            resultText.setText("Enter number!");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result=number1*number2;

            resultText.setText("Result: "+result);
            //direkt result(int) yazamayız çalıştırnca çöker,setText string istiyo o yüzden önce metinle
            // başlarsak direkt stringe cevirmis oluruz
        }
    }
    public void divide(View view){
        if (number1Text.getText().toString().matches("")||number2Text.getText().toString().matches("") ){
            resultText.setText("Enter number!");
        }else{
            int number1 = Integer.parseInt(number1Text.getText().toString());
            int number2 = Integer.parseInt(number2Text.getText().toString());

            int result=number1/number2;

            resultText.setText("Result: "+result);
            //direkt result(int) yazamayız çalıştırnca çöker,setText string istiyo o yüzden önce metinle
            // başlarsak direkt stringe cevirmis oluruz
        }
    }
}