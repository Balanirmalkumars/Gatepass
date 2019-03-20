package info.androidhive.barcodereader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class LogoutActivity extends AppCompatActivity {
Button lobtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_logout);
        lobtn=(Button)findViewById(R.id.logout_button);
        lobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent logouta=new Intent(LogoutActivity.this,New_LoginActivity.class);
                startActivity(logouta);
            }
        });
    }
}
