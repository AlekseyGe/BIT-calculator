package com.example.a2lesson;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageButton plusA;
    ImageButton minesA;
    TextView textA;

    ImageButton plusW;
    ImageButton minesW;
    TextView textW;

    ImageButton plusH;
    ImageButton minesH;
    TextView textH;

    @SuppressLint({"MissingInflatedId", "WrongViewCast"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        plusA = findViewById(R.id.PlusAge);
        minesA = findViewById(R.id.MinesAge);
        textA = findViewById(R.id.TextViewAge1);

        plusW = findViewById(R.id.imageButtonGalochka1);
        minesW = findViewById(R.id.imageButtonKrest1);
        textW = findViewById(R.id.TextViewWeight);

        plusH = findViewById(R.id.imageButtonGalochka2);
        minesH = findViewById(R.id.imageButtonKrest2);
        textH = findViewById(R.id.TextViewHeight);
    }

    public void onClickPlusAge(View v) {
        incrementAge();
    }
    public void onClickMinesAge(View v) {
        decrementAge();
    }

    public void onClickPlusWeight(View v) {
        incrementWeight();
    }
    public void onClickMinesWeight(View v) {
        decrementWeight();
    }

    public void onClickPlusHeight(View v) {
        incrementHeight();
    }
    public void onClickMinesHeight(View v) {
        decrementHeight();
    }


    private void incrementAge() {
        int currentAge = Integer.parseInt(textA.getText().toString());
        int newAge = currentAge + 1;
        textA.setText(String.valueOf(newAge));
    }
    private void decrementAge() {
        int currentAge = Integer.parseInt(textA.getText().toString());
        int newAge = currentAge - 1;
        textA.setText(String.valueOf(newAge));
    }

    private void incrementWeight() {
        int currentWeight = Integer.parseInt(textW.getText().toString());
        int newWeight = currentWeight + 5;
        textW.setText(String.valueOf(newWeight));
    }
    private void decrementWeight() {
        int currentWeight = Integer.parseInt(textW.getText().toString());
        int newWeight = currentWeight - 5;
        textW.setText(String.valueOf(newWeight));
    }

    private void incrementHeight() {
        int currentHeight = Integer.parseInt(textH.getText().toString());
        int newHeight = currentHeight + 5;
        textH.setText(String.valueOf(newHeight));
    }
    private void decrementHeight() {
        int currentHeight = Integer.parseInt(textH.getText().toString());
        int newHeight = currentHeight - 5;
        textH.setText(String.valueOf(newHeight));
    }
}
