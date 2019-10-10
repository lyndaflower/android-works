package com.example.myfirst;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

      @BindView(R.id.findButton) Button mFindChallenger;
      @BindView(R.id.appNameTextView) TextView mTextView;
      @BindView(R.id.locationEditText) EditText mLocationEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mFindChallenger.setOnClickListener(this);
    }
            @Override
            public void onClick(View v) {

                if(v == mFindChallenger) {
                    String location = mLocationEditText.getText().toString();
                    Intent intent = new Intent(MainActivity.this, AppActivity.class);
                    intent.putExtra("location", location);
                    startActivity(intent);
                }

            }
}
