package Solution.wildhack;

import static Solution.wildhack.WelcomeScreen.Look_For;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Answer_App extends AppCompatActivity {

    TextView answers, headline;
    public static String[] EXTRA_MESSAGE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.answer);

        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();
        String[] message = (WelcomeScreen.EXTRA_MESSAGE);

        // Capture the layout's TextView and set the string as its text
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(message);
        answers = findViewById(R.id.answer_ans);
        headline = findViewById(R.id.headline_ans);
        answers.setText(message[1]);
        headline.setText(message[0]);




        try {
            EditText editText = (EditText) findViewById(R.id.search_answer_now);

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