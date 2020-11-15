package com.example.counterhomework;


import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button ;
    TextView textView ;
    EditText editText ;
    private int number=0 ;
    private static final String TAG=MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize all the view variables.
        editText = findViewById(R.id.editTextTextPersonName2);
        textView = (TextView) findViewById(R.id.textView);


        // Restore the saved state.
        // See onSaveInstanceState() for what gets saved.
        if (savedInstanceState != null) {
            boolean isVisible =
                    savedInstanceState.getBoolean("reply_visible");
            // Show both the header and the message views. If isVisible is
            // false or missing from the bundle, use the default layout.
            if (isVisible) {
                textView.setVisibility(View.VISIBLE);
                textView.setText(savedInstanceState
                        .getString("reply_text"));
                textView.setVisibility(View.VISIBLE);
            }
        }
    }
    public void Count(View view) {
        number++;
        if (textView != null)
            textView.setText(Integer.toString(number));
    }
    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        if (textView.getVisibility() == View.VISIBLE) {
            outState.putBoolean("reply_visible", true);
            outState.putString("reply_text",textView.getText().toString());
        }

    }
    public void ReponseQuestion(){
        Log.d(TAG,"Question 1") ;
        Log.d(TAG,"Le compteur est réinitialisé à 0, mais le contenu de l'EditText est préservé.") ;

        Log.d(TAG,"Question 2") ;
        Log.d(TAG,"Android arrête votre activité en appelant onPause(), onStop() et onDestroy(), puis redémarre l'opération en appelant onCreate(), onStart() et onResume().") ;

        Log.d(TAG,"Question 3") ;
        Log.d(TAG,"onSaveInstanceState() est appelée avant la méthode onStop().") ;

        Log.d(TAG,"Question 4") ;
        Log.d(TAG,"onPause() ou onStop()") ;

    }


}