package Solution.wildhack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class Fillform extends AppCompatActivity {
    EditText Line2, Line3;
    Button registerB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fillform);

    }

    public void return_to_welcome_again (View view){
        Intent intent = new Intent(this, WelcomeScreen.class);
        startActivity(intent);
    }

    public void Send_And_Return (View view){
        Intent intent = new Intent(this, WelcomeScreen.class);
        startActivity(intent);
    }
}
