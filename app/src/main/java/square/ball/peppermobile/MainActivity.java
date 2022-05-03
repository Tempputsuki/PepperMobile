package square.ball.peppermobile;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;


public class MainActivity extends AppCompatActivity {

    Button one;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        one.findViewById(R.id.kalle);

        one.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v){
                    Intent i = new Intent(getApplicationContext(), CardView.class);
                    startActivity(i);

        }

    });

    }
}