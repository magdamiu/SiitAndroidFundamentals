package ro.magdamiu.myapplication.module5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import ro.magdamiu.myapplication.R;

public class SaveInstanceStateActivity extends AppCompatActivity {

    public static final String INPUT_VALUE = "input";
    public static final String CHECKBOX_VALUE = "checkbox";

    private EditText mEditTextInitial;
    private CheckBox mCheckBoxOption;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save_instance_state);

        initView();

        compute();
    }

    private void initView() {
        mEditTextInitial = findViewById(R.id.edit_text_initial);
        mCheckBoxOption = findViewById(R.id.checkbox_option);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(INPUT_VALUE, mEditTextInitial.getText().toString());
        outState.putBoolean(CHECKBOX_VALUE, mCheckBoxOption.isChecked());
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        String inputValue = savedInstanceState.getString(INPUT_VALUE);
        mEditTextInitial.setText(inputValue);
        boolean isChecked = savedInstanceState.getBoolean(CHECKBOX_VALUE);
        mCheckBoxOption.setChecked(isChecked);
    }

    private int compute() {
        int sum = 0;
        int newSum = makeSum(sum, 7);
        int result = newSum / 0;
        return result % 3;
    }

    private int makeSum(int a, int b) {
        return a + b;
    }
}
