package square.ball.peppermobile;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


import androidx.appcompat.app.AppCompatActivity;

public class CardView extends AppCompatActivity {

    Button standBtn;
    Button hitBtn;
    Button quitBtn;
    ImageView card1;
    ImageView card2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_view);

        standBtn = (Button) findViewById(R.id.standButton);
        hitBtn = (Button) findViewById(R.id.hitButton);
        quitBtn = (Button) findViewById(R.id.quitButton);
        card1 = (ImageView) findViewById(R.id.card1);
        card2 = (ImageView) findViewById(R.id.card2);

        /*standBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Log.d("buttonPressed", "stand toimii");

            }
        });
        hitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Log.d("buttonPressed", "hit toimii");

            }
        });
        quitBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Log.d("buttonPressed", "quit toimii");
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);

            }
        });*/
    }

    //Stand funktio firebasen kaa

    //Hit funktio firebasen kaa

    //Quittaus joka poistaa? pelaajan firebasesta

    //funktio joka hakee korttien arvot firebasesta ja laittaa oikeat kuvat imagevieweihin
}