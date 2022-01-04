package com.company.milkman;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView textViewMilkRate;
    private EditText editTextMilkRateEditor;
    private Spinner mySpinner;
    private ArrayAdapter<String> myAdapter;
    private TextView textView1, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11;
    private TextView textViewSlNo, textViewQuantity, textViewFat, textViewRowTotal;
    private TextView textViewDayTotal1, textViewDayTotal2, textViewDayTotal3, textViewDayTotal4, textViewDayTotal5, textViewDayTotal6, textViewDayTotal7, textViewDayTotal8, textViewDayTotal9, textViewDayTotal10, textViewDayTotal11;
    private TextView textViewGrandTotalView, textViewQuantityTotal, textViewFatTotal, textViewGrandTotal;
    private EditText editTextQuantiy1, editTextQuantiy2, editTextQuantiy3, editTextQuantiy4, editTextQuantiy5, editTextQuantiy6, editTextQuantiy7, editTextQuantiy8, editTextQuantiy9, editTextQuantiy10, editTextQuantiy11;
    private EditText editTextFat1, editTextFat2, editTextFat3, editTextFat4, editTextFat5, editTextFat6, editTextFat7, editTextFat8, editTextFat9, editTextFat10, editTextFat11;

    private int quantity1 = 0 ,quantity2 ,quantity3 ,quantity4 ,quantity5 ,quantity6 ,quantity7 ,quantity8 ,quantity9 ,quantity10 ,quantity11 = 0;
    private int fat1,fat2,fat3,fat4,fat5,fat6,fat7,fat8,fat9,fat10,fat11 = 0;
    private int day1,day2, day3, day4, day5, day6, day7, day8, day9, day10, day11 =0;
    private int milkRate, totalQuantity = 0;
    private double fatPercentage = 0.0;
    private double grandTotal = 0.0;

    private Button buttonOk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySpinner = findViewById(R.id.spinner);
        myAdapter = new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.day));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        textView1 = findViewById(R.id.textView1);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView5 = findViewById(R.id.textView5);
        textView6 = findViewById(R.id.textView6);
        textView7 = findViewById(R.id.textView7);
        textView8 = findViewById(R.id.textView8);
        textView9 = findViewById(R.id.textView9);
        textView10 = findViewById(R.id.textView10);
        textView11 = findViewById(R.id.textView11);

        textViewSlNo = findViewById(R.id.textViewSlNo);
        textViewQuantity = findViewById(R.id.textViewQuantity);
        textViewFat = findViewById(R.id.textViewFat);
        textViewRowTotal = findViewById(R.id.textViewRowTotal);

        textViewDayTotal1 = findViewById(R.id.textViewDayTotal1);
        textViewDayTotal2 = findViewById(R.id.textViewDayTotal2);
        textViewDayTotal3 = findViewById(R.id.textViewDayTotal3);
        textViewDayTotal4 = findViewById(R.id.textViewDayTotal4);
        textViewDayTotal5 = findViewById(R.id.textViewDayTotal5);
        textViewDayTotal6 = findViewById(R.id.textViewDayTotal6);
        textViewDayTotal7 = findViewById(R.id.textViewDayTotal7);
        textViewDayTotal8 = findViewById(R.id.textViewDayTotal8);
        textViewDayTotal9 = findViewById(R.id.textViewDayTotal9);
        textViewDayTotal10 = findViewById(R.id.textViewDayTotal10);
        textViewDayTotal11 = findViewById(R.id.textViewDayTotal11);

        textViewGrandTotalView = findViewById(R.id.textViewGrandTotalView);
        textViewQuantityTotal = findViewById(R.id.textViewQuantityTotal);
        textViewFatTotal = findViewById(R.id.textViewFatTotal);
        textViewGrandTotal = findViewById(R.id.textViewGrandTotal);

        editTextQuantiy1 = findViewById(R.id.editTextQuantiy1);
        editTextQuantiy2 = findViewById(R.id.editTextQuantiy2);
        editTextQuantiy3 = findViewById(R.id.editTextQuantiy3);
        editTextQuantiy4 = findViewById(R.id.editTextQuantiy4);
        editTextQuantiy5 = findViewById(R.id.editTextQuantiy5);
        editTextQuantiy6 = findViewById(R.id.editTextQuantiy6);
        editTextQuantiy7 = findViewById(R.id.editTextQuantiy7);
        editTextQuantiy8 = findViewById(R.id.editTextQuantiy8);
        editTextQuantiy9 = findViewById(R.id.editTextQuantiy9);
        editTextQuantiy10 = findViewById(R.id.editTextQuantiy10);
        editTextQuantiy11 = findViewById(R.id.editTextQuantiy11);
        editTextFat1 = findViewById(R.id.editTextFat1);
        editTextFat2 = findViewById(R.id.editTextFat2);
        editTextFat3 = findViewById(R.id.editTextFat3);
        editTextFat4 = findViewById(R.id.editTextFat4);
        editTextFat5 = findViewById(R.id.editTextFat5);
        editTextFat6 = findViewById(R.id.editTextFat6);
        editTextFat7 = findViewById(R.id.editTextFat7);
        editTextFat8 = findViewById(R.id.editTextFat8);
        editTextFat9 = findViewById(R.id.editTextFat9);
        editTextFat10 = findViewById(R.id.editTextFat10);
        editTextFat11 = findViewById(R.id.editTextFat11);


//        editTextQuantiy1.setText(quantity1);
//        editTextQuantiy2.setText(quantity2);
//        editTextQuantiy3.setText(quantity3);
//        editTextQuantiy4.setText(quantity4);
//        editTextQuantiy5.setText(quantity5);
//        editTextQuantiy6.setText(quantity6);
//        editTextQuantiy7.setText(quantity7);
//        editTextQuantiy8.setText(quantity8);
//        editTextQuantiy9.setText(quantity9);
//        editTextQuantiy10.setText(quantity10);
//        editTextQuantiy11.setText(quantity11);
//
//        editTextFat1.setText(fat1);
//        editTextFat2.setText(fat2);
//        editTextFat3.setText(fat3);
//        editTextFat4.setText(fat4);
//        editTextFat5.setText(fat5);
//        editTextFat6.setText(fat6);
//        editTextFat7.setText(fat7);
//        editTextFat8.setText(fat8);
//        editTextFat9.setText(fat9);
//        editTextFat10.setText(fat10);
//        editTextFat11.setText(fat11);
//
//        textViewDayTotal1.setText(day1);
//        textViewDayTotal1.setText(day2);
//        textViewDayTotal1.setText(day3);
//        textViewDayTotal1.setText(day4);
//        textViewDayTotal1.setText(day5);
//        textViewDayTotal1.setText(day6);
//        textViewDayTotal1.setText(day7);
//        textViewDayTotal1.setText(day8);
//        textViewDayTotal1.setText(day9);
//        textViewDayTotal1.setText(day10);
//        textViewDayTotal1.setText(day11);

        buttonOk = findViewById(R.id.buttonOk);

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rateCalculation();
            }
        });

//        buttonClear

    }

    public void dayChange(){

        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");
        textViewDayTotal1.setText("");

        editTextQuantiy1.setText("");
        editTextQuantiy2.setText("");
        editTextQuantiy3.setText("");
        editTextQuantiy4.setText("");
        editTextQuantiy5.setText("");
        editTextQuantiy6.setText("");
        editTextQuantiy7.setText("");
        editTextQuantiy8.setText("");
        editTextQuantiy9.setText("");
        editTextQuantiy10.setText("");
        editTextQuantiy11.setText("");

        editTextFat1.setText("");
        editTextFat2.setText("");
        editTextFat3.setText("");
        editTextFat4.setText("");
        editTextFat5.setText("");
        editTextFat6.setText("");
        editTextFat7.setText("");
        editTextFat8.setText("");
        editTextFat9.setText("");
        editTextFat10.setText("");
        editTextFat11.setText("");

    }

    public void rateCalculation(){

        quantity1 = Integer.parseInt(editTextQuantiy1.getText().toString());
        quantity2 = Integer.parseInt(editTextQuantiy2.getText().toString());
        quantity3 = Integer.parseInt(editTextQuantiy3.getText().toString());
        quantity4 = Integer.parseInt(editTextQuantiy4.getText().toString());
        quantity5 = Integer.parseInt(editTextQuantiy5.getText().toString());
        quantity6 = Integer.parseInt(editTextQuantiy6.getText().toString());
        quantity7 = Integer.parseInt(editTextQuantiy7.getText().toString());
        quantity8 = Integer.parseInt(editTextQuantiy8.getText().toString());
        quantity9 = Integer.parseInt(editTextQuantiy9.getText().toString());
        quantity10 = Integer.parseInt(editTextQuantiy10.getText().toString());
        quantity11 = Integer.parseInt(editTextQuantiy11.getText().toString());

        fat1 = Integer.parseInt(editTextFat1.getText().toString());
        fat2 = Integer.parseInt(editTextFat2.getText().toString());
        fat3 = Integer.parseInt(editTextFat3.getText().toString());
        fat4 = Integer.parseInt(editTextFat4.getText().toString());
        fat5 = Integer.parseInt(editTextFat5.getText().toString());
        fat6 = Integer.parseInt(editTextFat6.getText().toString());
        fat7 = Integer.parseInt(editTextFat7.getText().toString());
        fat8 = Integer.parseInt(editTextFat8.getText().toString());
        fat9 = Integer.parseInt(editTextFat9.getText().toString());
        fat10 = Integer.parseInt(editTextFat10.getText().toString());
        fat11 = Integer.parseInt(editTextFat11.getText().toString());

        milkRate = Integer.parseInt(editTextMilkRateEditor.getText().toString());

        int day1 = (milkRate * quantity1 * fat1) / 10;
        int day2 = (milkRate * quantity2 * fat2) / 10;
        int day3 = (milkRate * quantity3 * fat3) / 10;
        int day4 = (milkRate * quantity4 * fat4) / 10;
        int day5 = (milkRate * quantity5 * fat5) / 10;
        int day6 = (milkRate * quantity6 * fat6) / 10;
        int day7 = (milkRate * quantity7 * fat7) / 10;
        int day8 = (milkRate * quantity8 * fat8) / 10;
        int day9 = (milkRate * quantity9 * fat9) / 10;
        int day10 = (milkRate * quantity10 * fat10) / 10;
        int day11 = (milkRate * quantity11 * fat11) / 10;

        textViewDayTotal1.setText(day1);
        textViewDayTotal1.setText(day2);
        textViewDayTotal1.setText(day3);
        textViewDayTotal1.setText(day4);
        textViewDayTotal1.setText(day5);
        textViewDayTotal1.setText(day6);
        textViewDayTotal1.setText(day7);
        textViewDayTotal1.setText(day8);
        textViewDayTotal1.setText(day9);
        textViewDayTotal1.setText(day10);
        textViewDayTotal1.setText(day11);

        totalQuantity = (quantity1 + quantity2 + quantity3 + quantity4 + quantity5 + quantity6 + quantity7 + quantity8+ quantity9 + quantity10+ quantity11);
        textViewQuantityTotal.setText(totalQuantity);

//        fatPercentage = ( fat1 + fat2 + fat3 +fat4 +fat5 +fat6 +fat7 +fat8 + fat9 + fat10 + fat11) / 11;
//        textViewFatTotal.setText(fatPercentage);

        grandTotal = Double.valueOf( day1 + day2 + day3 + day4 + day5 + day6 + day7 + day8 + day9 + day10 + day11);
        textViewGrandTotal.setText((int) grandTotal);
    }
}