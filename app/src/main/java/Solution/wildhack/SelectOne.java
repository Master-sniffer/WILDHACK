package Solution.wildhack;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class SelectOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectone);
    }

    public void Podat_Zaiavku (View view){
        Intent intent = new Intent(this, WelcomeScreen.class);
        startActivity(intent);
    }

    public void Back_from_selectOne (View view ){
        Intent intent = new Intent(this, WelcomeScreen.class);
        startActivity(intent);
    }
}