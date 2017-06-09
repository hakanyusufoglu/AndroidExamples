package hakan.com.kayitformu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button btnTikla=(Button)findViewById(R.id.btnTikla);
        btnTikla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText name=(EditText) findViewById(R.id.editText);
                String getName=name.getText().toString();
                EditText surname=(EditText) findViewById(R.id.editText2);
                String getSurname=surname.getText().toString();

                String smsNumber="05460000000";
                String smsText=getName+" "+getSurname;

                Uri uri=Uri.parse("smsto:"+smsNumber);
                Intent intent = new Intent(Intent.ACTION_SENDTO,uri);
                intent.putExtra("sms_body",smsText);
                startActivity(intent);


            }
        });
    }
}
