package com.example.new_project_02;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.new_project_02.utils.TextCounter;

public class MainActivity extends AppCompatActivity {

    TextView tvResult;
    EditText edUserInput;
    Spinner spSelectionOptions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        this.tvResult = findViewById(R.id.tvCountResult);
        this.edUserInput = findViewById(R.id.edUserInput);
        this.spSelectionOptions = findViewById(R.id.spSelectionOptions);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this,
                R.array.count_options,
                android.R.layout.simple_spinner_item
        );
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spSelectionOptions.setAdapter(adapter);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void onBtnCountClick(View view) {
        String userPhrase = this.edUserInput.getText().toString();
        if(this.spSelectionOptions.getSelectedItem().toString().equalsIgnoreCase(getString(R.string.chars_selection)))
        {
            int charsCount = TextCounter.getCharsCount(userPhrase);
            this.tvResult.setText(String.valueOf(charsCount));
        }
        else{
            int wordCount=TextCounter.getWordCount(userPhrase);
            this.tvResult.setText(String.valueOf(wordCount));
        }
    }
}