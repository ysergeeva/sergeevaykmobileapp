package ru.mirea.sergeevayk.buttonclicker;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private TextView textViewStudent;
    private Button btnWhoAmI;
    private Button btnItIsNotMe;
    private CheckBox checkBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewStudent = findViewById(R.id.textViewStudent);
        btnWhoAmI = findViewById(R.id.btnWhoAmI);
        btnItIsNotMe = findViewById(R.id.btnItIsNotMe);
        checkBox = findViewById(R.id.checkBox);

        View.OnClickListener ocBtnWhoAmI = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textViewStudent.setText("Мой номер по списку № 5");
                checkBox.setChecked(!checkBox.isChecked());
            }
        };

        // Устанавливаем обработчик на кнопку
        btnWhoAmI.setOnClickListener(ocBtnWhoAmI);
    }

    // Метод для второй кнопки (через атрибут onClick в XML)
    public void onItIsNotMeClick(View v) {
        textViewStudent.setText("Это не я сделал");
        checkBox.setChecked(!checkBox.isChecked());
    }
}