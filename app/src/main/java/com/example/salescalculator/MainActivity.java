package com.example.salescalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //calculated actualPrices
    public  double flourCalcActualPrice;
    public  double breadCalcActualPrice;
    public  double sugarCalcActualPrice;
    public  double milkCalcActualPrice;
    //declaring counts
    public double milkCount = 0;
    public double sugarCount = 0;
    public double flourCount = 0;
    public double breadCount = 0;
    //declaring prices
    public double milkPrice = 900;
    public double sugarPrice = 1000;
    public double flourPrice = 1500;
    public double breadPrice = 800;
    public  double vatValue = 0.16;
    public  double DiscountValue =0.15;
    public  double grandTotal = 0;
    public double netIncome =0;
    public double discountAmount=0;
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
        Button milkButton = findViewById(R.id.milk_button);
        milkButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Check if milkCount is less than 4 before updating
                if (milkCount < 4) {
                    milkCount++;
                    // Calculate price, VAT, and actual price
                    double milkItemPrice = milkCount * milkPrice;
                    double milkItemVAT = milkItemPrice * vatValue;
                     milkCalcActualPrice = milkItemPrice + milkItemVAT;

                    // Update UI elements
                    milkPriceTextView.setText(String.format("%.2f", milkItemPrice));
                    milkVatTextView.setText(String.format("%.2f", milkItemVAT));
                    milkActualPriceTextView.setText(String.format("%.2f", milkCalcActualPrice));
//                    grandTotal();
//                    TotalDiscount();
//                    netPayEarned();
                }else {
                    Toast.makeText(MainActivity.this, "Can only purchase Milk 4 times", Toast.LENGTH_SHORT).show();
                }
            }
        });
        sugarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(sugarCount<4){
                    sugarCount++;
                    //calculate the price , Vat and actualPrice
                    double sugarCalcPrice=sugarPrice *sugarCount;
                    double sugarCalcVat = sugarCalcPrice * vatValue;
                     sugarCalcActualPrice = sugarCalcPrice + sugarCalcVat;
                    //display the price , vat and actualPrice in the textFields;
                     sugarPriceTextView.setText(String.format("%.2f",sugarCalcPrice));
                     sugarVatTextView.setText(String.format("%.2f",sugarCalcVat));
                     sugarActualPriceTextView.setText(String.format("%.2f",sugarCalcActualPrice));
//                     grandTotal();
//                     TotalDiscount();
//                     netPayEarned();
                }else {
                    Toast.makeText(MainActivity.this, "Can only purchase sugar 4 times", Toast.LENGTH_SHORT).show();
                }
            }
        });
        flourButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flourCount<4){
                    flourCount++;
                    //calculate the price , Vat and actualPrice
                    double flourCalcPrice=flourPrice *flourCount;
                    double flourCalcVat = flourCalcPrice * vatValue;
                    flourCalcActualPrice = flourCalcPrice + flourCalcVat;
                    //display the price , vat and actualPrice in the textfields;
                    flourPriceTextView.setText(String.format("%.2f",flourCalcPrice));
                    flourVatTextView.setText(String.format("%.2f",flourCalcVat));
                    flourActualPriceTextView.setText(String.format("%.2f",flourCalcActualPrice));
//                    grandTotal();
//                    TotalDiscount();
//                    netPayEarned();
                }else {
                    Toast.makeText(MainActivity.this, "Can only purchase flour 4 times", Toast.LENGTH_SHORT).show();
                }
            }
        });
        breadButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(breadCount<4){
                    breadCount++;
                    //calculate the price , Vat and actualPrice
                    double breadCalcPrice=breadCount * breadPrice;
                    double breadCalVat = breadCalcPrice * vatValue;
                    breadCalcActualPrice= breadCalcPrice + breadCalVat;
                    //display the price , vat and actualPrice in the textfields;
                    breadPriceTextView.setText(String.format("%.2f",breadCalcPrice));
                    breadVatTextView.setText(String.format("%.2f",breadCalVat));
                    breadActualPriceTextView.setText(String.format("%.2f",breadCalcActualPrice));
//                    grandTotal();
//                    TotalDiscount();
//                    netPayEarned();
                }else {
                    Toast.makeText(MainActivity.this, "Can only purchase bread 4 times", Toast.LENGTH_SHORT).show();
                }
            }
        });
        grandTotalButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                grandTotal();
            }
        });
        discountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TotalDiscount();
            }
        });
        netpayButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                netPayEarned();
            }
        });
        clearSalesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clearSales();
            }
        });
    }

    void grandTotal(){
        grandTotal = breadCalcActualPrice + flourCalcActualPrice + milkCalcActualPrice + sugarCalcActualPrice;
        grandTotalTextView.setText(String.format("%.2f",grandTotal));
    }
    void TotalDiscount(){
        if(grandTotal<10000){
            Toast.makeText(this, "No discount awarded", Toast.LENGTH_SHORT).show();
        }else {
            discountAmount = grandTotal * DiscountValue;
            discountTextView.setText(String.format("%.2f",discountAmount));
        }
    }
    void  netPayEarned(){
        netIncome =  grandTotal- discountAmount;
        netPayTextView.setText(String.format("%.2f",netIncome));
    }
    void clearSales(){
        milkCount =0;
        breadCount = 0;
        sugarCount = 0;
        flourCount = 0;
        //reset the text views
        milkCalcActualPrice = 0;
        breadCalcActualPrice = 0;
        sugarCalcActualPrice = 0;
        flourCalcActualPrice = 0;
        //milkTextViews

        milkPriceTextView.setText("");
        milkVatTextView.setText("");
        milkActualPriceTextView.setText("");
        //breadTextViews
        breadPriceTextView.setText("");
        breadVatTextView.setText("");
        breadActualPriceTextView.setText("");
        //sugarTextViews
        sugarPriceTextView.setText("");
        sugarVatTextView.setText("");
        sugarActualPriceTextView.setText("");
        //flourTextViews
        flourPriceTextView.setText("");
        flourVatTextView.setText("");
        flourActualPriceTextView.setText("");
        // grand , discount and netIncome textViews
        // Reset grandTotal, netIncome, and discountAmount
        grandTotal = 0;
        netIncome = 0;
        discountAmount = 0;
        grandTotalTextView.setText("");
        netPayTextView.setText("");
        discountTextView.setText("");
    }
}