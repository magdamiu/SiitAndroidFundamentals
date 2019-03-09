package ro.magdamiu.myapplication.module6;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import ro.magdamiu.myapplication.R;

public class MethodFragmentActivity extends AppCompatActivity {

    private EditText mEditTextName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_method_fragment);
        initView();
    }

    private void initView() {
        mEditTextName = findViewById(R.id.edit_text_name);
    }

    private void addFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.container_method_fragment, fragment);
        fragmentTransaction.commit();
    }

    public void btnSendNameOnClick(View view) {
        if(mEditTextName != null) {
            String name = mEditTextName.getText().toString();
            if(name != null && !name.isEmpty()) {
                MethodFragment methodFragment = new MethodFragment();
                methodFragment.setName(name);
                addFragment(methodFragment);
            }
        }
    }
}
