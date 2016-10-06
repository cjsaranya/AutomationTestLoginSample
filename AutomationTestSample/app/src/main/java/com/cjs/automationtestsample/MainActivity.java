package com.cjs.automationtestsample;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText mEdtUsername;
    EditText mEdtPassword;
    Button mBtnSubmit;
    public static MainActivity mainActivity;
    InputMethodManager imm;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
    }

    private void initViews(){
        mEdtUsername = (EditText)findViewById(R.id.edt_username);
        mEdtPassword = (EditText)findViewById(R.id.edt_password);
        mBtnSubmit = (Button)findViewById(R.id.btn_login);
        mBtnSubmit.setOnClickListener(this);
        imm = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);


        mainActivity=this;
        mEdtUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

    @Override
    public void onClick(View view) {
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
        if(view.getId()== R.id.btn_login){
            isValidEmail(mEdtUsername.getText().toString());

        }


    }

    public final static boolean isValidEmail(CharSequence target) {
        if (TextUtils.isEmpty(target)) {
            showToast("Email is incorrect");
            return false;
        } else {
            showToast("Success!");
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    private  static  void showToast(String message){
        Toast.makeText(mainActivity,message,Toast.LENGTH_LONG).show();
    }
}
