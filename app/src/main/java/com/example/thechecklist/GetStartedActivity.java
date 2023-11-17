package com.example.thechecklist;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RelativeLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GetStartedActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.get_started);

        FloatingActionButton fabAdd = findViewById(R.id.fabAdd);
        RelativeLayout layout = findViewById(R.id.parentLayout); // Updated to reference the RelativeLayout

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Create and add CheckBox elements dynamically
                addCheckBox(layout);
                addCheckBox(layout);
            }
        });
    }

    private void addCheckBox(RelativeLayout layout) {
        CheckBox checkBox = new CheckBox(this);
        checkBox.setText("New Check Box");
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(
                RelativeLayout.LayoutParams.WRAP_CONTENT,
                RelativeLayout.LayoutParams.WRAP_CONTENT
        );
        params.addRule(RelativeLayout.BELOW, R.id.fabAdd);
        checkBox.setLayoutParams(params);
        layout.addView(checkBox);
    }
}
