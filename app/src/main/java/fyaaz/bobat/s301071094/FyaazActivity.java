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

public class FyaazActivity extends Activity {
    Button submit;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username = (EditText)findViewById(R.id.fyaTextPass);
        password = (EditText)findViewById(R.id.fyaNum);
        submit = (Button) findViewById(R.id.fyabutton);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Login();
            }
        });

    }

    public void Login()
    {
        if(username.getText().toString().equals("fyaaz.bobat") && password.getText().toString().equals("301071094")){
            Intent intent = new Intent(this,BobatActivity.class);
            startActivity(intent);
        //correcct password
    }else{
        //wrong password
    }
    }
}