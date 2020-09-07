package kz.jic.signinup;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity {

    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        img = findViewById(R.id.goBackIcon);
    }

    public void goback(View view) {
        Intent ic = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(ic);
    }
}