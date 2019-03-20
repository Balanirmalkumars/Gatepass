package info.androidhive.barcodereader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class New_LoginActivity extends AppCompatActivity {
ImageButton new_log;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new__login);
        new_log=(ImageButton)findViewById(R.id.new_log_imageButton);
        new_log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ni=new Intent(New_LoginActivity.this,LoginActivity.class);
                startActivity(ni);
            }
        });
    }
}
