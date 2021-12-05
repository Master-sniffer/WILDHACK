package Solution.wildhack;

import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeScreen extends AppCompatActivity {

    Button Dle_Vas_Wel, Zametki_Wel, FAQ_Wel,  SOS_Wel , Eshe_Wel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_screen);

        EditText editText = (EditText) findViewById(R.id.search_Wel);

        editText.setOnEditorActionListener(new TextView.OnEditorActionListener() {
            @Override
            public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
                Change();
                return true;
            }
        });
    }

    public void zametki_wel (View view){
        Intent intent = new Intent(this, Enter_Or_Logi.class);
        startActivity(intent);
    }

    public void faq_wel (View view){
        boolean connected = false;
        ConnectivityManager connectivityManager = (ConnectivityManager)getSystemService(Context.CONNECTIVITY_SERVICE);
        if(connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE).getState() == NetworkInfo.State.CONNECTED ||
                connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI).getState() == NetworkInfo.State.CONNECTED) {
            //we are connected to a network
            connected = true;
        }
        else{
            connected = false;}


        Log.i("Connection", String.valueOf(connected));

        if (connected==true){
            Intent intent = new Intent(this, FAQ_INTERNET.class);
            startActivity(intent);
        } else {
        Intent intent = new Intent(this, FAQ_OFFLINE.class);
        startActivity(intent); }
    }

    public void sos_wel (View view){
        Intent intent = new Intent(this, Enter_Or_Logi.class);
        startActivity(intent);
    }

    public void eshe_wel (View view){
        Intent intent = new Intent(this, Enter_Or_Logi.class);
        startActivity(intent);
    }


    public void Change (){
//        Intent intent = new Intent(this, Enter_Or_Logi.class);
//        startActivity(intent);
    }





}