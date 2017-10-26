package com.voting.internship.voting_app;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.voting.internship.voting_app.R.string.admin;


public class MainActivity extends Activity {

    private static final int READ_BLOCK_SIZE = 100;
    EditText et1, et2;
    Button b1, b2;
    String Enter_Login_id, Enter_Aadhar_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        et1 = (EditText)findViewById(R.id.tv1);
        et2 = (EditText)findViewById(R.id.tv2);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Enter_Login_id = et1.getText().toString();
                Enter_Aadhar_no = et2.getText().toString();
                if (!isValidLogin_id(Enter_Login_id))
                    et1.setError(getString(R.string.invalid_login_id));

                if (!isValidLength(Enter_Aadhar_no)) {
                    et2.setError(getString(R.string.Incorect_aadhar_no));
                }
                else {
                    if (Enter_Aadhar_no.isEmpty() || Enter_Login_id.isEmpty()) {

                        et2.setError(getString(R.string.one_of_the_field_is_empty));

                    }
                    else
                    {
                        Intent vote = new Intent("vote");
                        startActivity(vote);
                    }
                }

            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Admin = new Intent("Admin");
                startActivity(Admin);

            }
        });
    }
    private boolean isValidLogin_id(String Enter_Login_id) {


        String login = "^[a-c]";
        Pattern pattern = Pattern.compile(login);
        Matcher matcher = pattern.matcher(Enter_Login_id);
        return matcher.matches();
    }

    private boolean isValidLength(String Enter_Aadhar_no) {
        if (Enter_Aadhar_no.length() == 12)
        {
            return true;
        }
        return false;
    }


    }

