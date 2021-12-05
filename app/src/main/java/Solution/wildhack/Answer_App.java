package Solution.wildhack;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Answer_App extends AppCompatActivity {

    TextView answers, headline;

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
    }
}