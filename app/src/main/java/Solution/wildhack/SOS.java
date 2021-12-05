package Solution.wildhack;

import static Solution.wildhack.WelcomeScreen.Look_For;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class SOS extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sos);


        try {
            EditText editText = (EditText) findViewById(R.id.search_sos);

            editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
                @Override
                public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                    WelcomeScreen.EXTRA_MESSAGE = Look_For(editText.getText().toString());
                    Change(WelcomeScreen.EXTRA_MESSAGE);
                    return true;
                }
            });
        } catch (Exception e){
            Log.i("Exception", String.valueOf(e));
        }


    }


    public void Change(String[] output) {
        Intent intent = new Intent(this, Answer_App.class);
        startActivity(intent);
    }

}