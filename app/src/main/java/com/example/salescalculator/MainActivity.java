package com.example.salescalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //declaring prices
    public float milkPrice = 100;
    public float sugarPrice = 100;
    public float flourPrice = 500;
    public float breadPrice = 200;
    public  float vatValue = 16F/100;
    public  float DiscountValue = 15F/100;
    // TextViews variable declaration
    TextView milkPriceTextView, milkVatTextView, milkActualPriceTextView;
    TextView sugarPriceTextView, sugarVatTextView, sugarActualPriceTextView;
    TextView flourPriceTextView, flourVatTextView, flourActualPriceTextView;
    TextView breadPriceTextView, breadVatTextView, breadActualPriceTextView;
    TextView grandTotalTextView, discountTextView, netPayTextView;
    // Buttons
    Button milkButton, sugarButton, flourButton, breadButton, grandTotalButton;
    Button discountButton, netpayButton, clearSalesButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //milk Textviews
        milkPriceTextView = findViewById(R.id.milk_price_textview);
        milkVatTextView = findViewById(R.id.milk_vat_textview);
        milkActualPriceTextView = findViewById(R.id.milk_actual_price_textview);
        // sugar Textviews
        sugarPriceTextView = findViewById(R.id.sugar_price_textview);
        sugarVatTextView = findViewById(R.id.sugar_vat_textview);
        sugarActualPriceTextView = findViewById(R.id.sugar_actual_price_textview);
        // flour TextViews
        flourPriceTextView = findViewById(R.id.flour_price_textview);
        flourVatTextView = findViewById(R.id.flour_vat_textview);
        flourActualPriceTextView= findViewById(R.id.flour_actual_price_textview);
        // bread Textviews
        breadPriceTextView = findViewById(R.id.bread_price_textview);
        breadVatTextView = findViewById(R.id.bread_vat_textview);
        breadActualPriceTextView= findViewById(R.id.bread_actual_price_textview);
        //Grandtotal , discount , netpay Textviews
        grandTotalTextView = findViewById(R.id.grand_total_textview);
        discountTextView = findViewById(R.id.discount_textview);
        netPayTextView = findViewById(R.id.net_pay_textview);
        // Buttons
        milkButton = findViewById(R.id.milk_button);
        sugarButton = findViewById(R.id.sugar_button);
        flourButton = findViewById(R.id.flour_button);
        breadButton= findViewById(R.id.bread_button);
        grandTotalButton = findViewById(R.id.grand_total_button);
        discountButton= findViewById(R.id.discount_button);
        netpayButton = findViewById(R.id.netpay_button);
        clearSalesButton = findViewById(R.id.clear_button);
        milkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        sugarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        flourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        breadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }
}