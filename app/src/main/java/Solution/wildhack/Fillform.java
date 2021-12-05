package Solution.wildhack;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Fillform extends AppCompatActivity {
    EditText Line2, Line3;
    Button registerB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fillform);
        registerB = (Button) findViewById(R.id.register);
        Line2 = (EditText) findViewById(R.id.editTextTextMultiLine2);
        Line3 = (EditText) findViewById(R.id.editTextTextMultiLine3);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            }
        };
        registerB.setOnClickListener(clickListener);

    }
}
