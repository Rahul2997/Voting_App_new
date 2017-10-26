package com.voting.internship.voting_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.FileInputStream;
import java.io.InputStreamReader;

public class count extends Activity {

    static final int READ_BLOCK_SIZE = 100;
    EditText textmsg,textmsg1,textmsg2,textmsg3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);

        textmsg = (EditText)findViewById(R.id.et1_count);
         textmsg1 = (EditText) findViewById(R.id.et2_count);
        textmsg2 = (EditText) findViewById(R.id.et3_count);
         textmsg3 = (EditText) findViewById(R.id.et4_count);

    }

    public void ReadMNS(View view) {

        //reading text from file
        try {
            FileInputStream fileIn=openFileInput("vote1.txt");
            InputStreamReader InputRead= new InputStreamReader(fileIn);

            char[] inputBuffer= new char[READ_BLOCK_SIZE];
            String s="";
            int charRead;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s +=readstring;
            }
            InputRead.close();
            textmsg.setText(s);


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void ReadSHIVSENA(View view) {
        try {
            FileInputStream fileIn=openFileInput("vote2.txt");
            InputStreamReader InputRead= new InputStreamReader(fileIn);

            char[] inputBuffer= new char[READ_BLOCK_SIZE];
            String s="";
            int charRead;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s +=readstring;
            }
            InputRead.close();
            textmsg1.setText(s);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ReadCONGRESS(View view) {
        try {
            FileInputStream fileIn=openFileInput("vote3.txt");
            InputStreamReader InputRead= new InputStreamReader(fileIn);

            char[] inputBuffer= new char[READ_BLOCK_SIZE];
            String s="";
            int charRead;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s +=readstring;
            }
            InputRead.close();
            textmsg2.setText(s);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void ReadBJP(View view) {
        try {
            FileInputStream fileIn=openFileInput("vote4.txt");
            InputStreamReader InputRead= new InputStreamReader(fileIn);

            char[] inputBuffer= new char[READ_BLOCK_SIZE];
            String s="";
            int charRead;

            while ((charRead=InputRead.read(inputBuffer))>0) {
                // char to string conversion
                String readstring=String.copyValueOf(inputBuffer,0,charRead);
                s +=readstring;
            }
            InputRead.close();
            textmsg3.setText(s);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void back(View view) {

        Toast.makeText(getBaseContext(), R.string.THANK_YOU,Toast.LENGTH_LONG).show();
        finish();

    }
}
