package fyaaz.bobat.s301071094;
// 301071094 Fyaaz Bobat

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import static androidx.constraintlayout.motion.widget.TransitionBuilder.validate;

public class FyaazActivity extends AppCompatActivity {
    Button submit;
    EditText Fyaazusername;
    EditText FyaazPassword;
    public int count = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Fyaazusername = (EditText)findViewById(R.id.fyaTextPass);
        FyaazPassword = (EditText)findViewById(R.id.fyaNum);
        submit = (Button) findViewById(R.id.fyabutton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login(Fyaazusername.getText().toString(),FyaazPassword.getText().toString());
            }
        });

    }

    public void Login(String username, String password) {
        if (username.equals("fyaaz.bobat") && (password.equals("301071094"))) {
            Intent intent = new Intent(this, BobatActivity.class);
            startActivity(intent);
            //correcct password
        } else {
            count--;
            if (count == 0) {
                submit.setEnabled(false);
            }
        }
    }}