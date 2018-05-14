package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA, scoreB;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void reset(View view){
        scoreA=0;
        scoreB=0;
        display();
    }

    public void addPt(View view){
        int i = Integer.parseInt(view.getTag().toString());
        int j = i%10;
        if((i/10)==2) {
            scoreB = scoreB + j;
        }
        else {
            scoreA = scoreA + j;
        }
        display();
    }
    public void display(){
        TextView tvScoreA = (TextView)findViewById(R.id.team_a_score);
        tvScoreA.setText(""+scoreA);
        TextView tvScoreB = (TextView)findViewById(R.id.team_b_score);
        tvScoreB.setText(""+scoreB);
    }
}
