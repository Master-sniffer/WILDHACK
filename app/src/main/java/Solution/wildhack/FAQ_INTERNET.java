package Solution.wildhack;

import static Solution.wildhack.WelcomeScreen.Look_For;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FAQ_INTERNET extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.faq_youtube_video);


        try {
            EditText editText = (EditText) findViewById(R.id.search_internet_faq);

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

    public void Go_To_Youtube (View view){
        Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.youtube.com/watch?v=Zv4hIaVvFVI&ab_channel=вДудь"));
        startActivity(browserIntent);
    }


}