package com.example.khairulamin.prj1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.LinearLayout;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText txtEdit;
    private Button btnButton;
    private LinearLayout linear;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txtEdit = (EditText) findViewById(R.id.txtEdit);
        btnButton = (Button) findViewById(R.id.btnButton);
        linear = (LinearLayout) findViewById(R.id.linear);

        btnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                LinearLayout.LayoutParams layout = new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.FILL_PARENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT);

                TextView textView = new TextView(MainActivity.this);
                textView.setText(txtEdit.getText());
                textView.setLayoutParams(layout);
                linear.addView(textView);

            }
        });
    }


}
