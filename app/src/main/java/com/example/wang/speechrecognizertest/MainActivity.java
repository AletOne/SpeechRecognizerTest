package com.example.wang.speechrecognizertest;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import android.os.Handler;
import android.speech.RecognizerIntent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "VoiceRecognition";
    private static final int VOICE_RECOG_REQUEST_CODE = 1234;


    private TextView mTextMessage;
    private Button holdBtn;

    private Handler mHanlder;
    //private Spinner


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextMessage = (TextView) findViewById(R.id.message);

        holdBtn = findViewById(R.id.speech_button);

//        PackageManager pm = getPackageManager();
//        List<ResolveInfo> activies = pm.queryIntentActivities(new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH),0
//                );
//        if (activies.size() != 0){
//            holdBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    Intent intent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
//                    // Specify the calling package to identify your application
//                    intent.putExtra(RecognizerIntent.EXTRA_CALLING_PACKAGE, getClass().getPackage().getName());
//                    // Display an hint to the user about what he should say.
//                    intent.putExtra(RecognizerIntent.EXTRA_PROMPT, "Speech recognition demo");
//                    // Given an hint to the recognizer about what the user is going to say
//                    intent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL,
//                            RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
//                    // Specify how many results you want to receive. The results will be sorted
//                    // where the first result is the one with higher confidence.
//                    intent.putExtra(RecognizerIntent.EXTRA_MAX_RESULTS, 5);
//                    startActivityForResult(intent, VOICE_RECOG_REQUEST_CODE);
//                }
//            });
//        }else{
//            holdBtn.setEnabled(false);
//            holdBtn.setText("Recognizer not present");
//        }






    }

//    @Override
//    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
//
//        if (requestCode == VOICE_RECOG_REQUEST_CODE){
//            ArrayList<String> result = data.getStringArrayListExtra(RecognizerIntent.EXTRA_RESULTS);
//            String s = null;
//            if (result != null && result.size() != 0){
//                for (String r : result){
//                    s += r + "\n";
//                }
//                mTextMessage.setText(s);
//            }
//
//        }
//    }

    
}
