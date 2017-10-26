package com.voting.internship.voting_app;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


import java.io.FileOutputStream;


import java.io.OutputStreamWriter;



public class vote extends Activity {

    Button b1,b2,b3,b4,b5;
    int countclick1 = 0;
    int countclick2 = 0;
    int countclick3 = 0;
    int countclick4 = 0;
    int status=0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vote);

        b1 = (Button)findViewById(R.id.b1_vote);
        b2 = (Button)findViewById(R.id.b2_vote);
        b3 = (Button)findViewById(R.id.b3_vote);
        b4 = (Button)findViewById(R.id.b4_vote);
        b5 = (Button)findViewById(R.id.b5_vote);




    }



    public void Writebtn1(View view) {
        countclick1 = countclick1 + 1;
        String vote1 = String.valueOf(countclick1);
        while (status == 0) {
            try {
                FileOutputStream fileout = openFileOutput("vote1.txt", MODE_PRIVATE);
                OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                outputWriter.write(vote1);
                outputWriter.close();

                //display file saved message
                Toast.makeText(getBaseContext(), R.string.vote_taken_succesfully,
                        Toast.LENGTH_SHORT).show();
                status = 1;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void Writebtn2(View view) {

        countclick2 = countclick2 + 1;
        String vote2 = String.valueOf(countclick2);
        while (status ==0) {
            try {
                FileOutputStream fileout = openFileOutput("vote2.txt", MODE_PRIVATE);
                OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                outputWriter.write(vote2);
                outputWriter.close();

                //display file saved message
                Toast.makeText(getBaseContext(), R.string.vote_taken_succesfully,
                        Toast.LENGTH_SHORT).show();
                status = 1;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void Writebtn3(View view) {

        countclick3 = countclick3 + 1;
        String vote3 = String.valueOf(countclick3);
        while(status==0) {
            try {
                FileOutputStream fileout = openFileOutput("vote3.txt", MODE_PRIVATE);
                OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                outputWriter.write(vote3);
                outputWriter.close();

                //display file saved message
                Toast.makeText(getBaseContext(), R.string.vote_taken_succesfully,
                        Toast.LENGTH_SHORT).show();
                status=1;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void Writebtn4(View view) {

        countclick4 = countclick4+ 1;
        String vote4 = String.valueOf(countclick4);
        while(status==0) {
            try {
                FileOutputStream fileout = openFileOutput("vote4.txt", MODE_PRIVATE);
                OutputStreamWriter outputWriter = new OutputStreamWriter(fileout);
                outputWriter.write(vote4);
                outputWriter.close();

                //display file saved message
                Toast.makeText(getBaseContext(), R.string.vote_taken_succesfully,
                        Toast.LENGTH_SHORT).show();
                status = 1;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

    }

}

