package Solution.wildhack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Enter_Or_Logi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }


    public void Register (View view){
        Intent intent = new Intent(this, WelcomeScreen.class);
        startActivity(intent);
    }

    public void Login (View view){
        //TODO
    }
}