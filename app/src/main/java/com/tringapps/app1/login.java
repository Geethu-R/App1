package com.tringapps.app1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.common.api.GoogleApiClient;

public class login extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    private GoogleApiClient client;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);

        TextView mine = (TextView) findViewById(R.id.textid);
        mine.setText("Hello");

        View.OnClickListener onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /*Toast.makeText(login.this, mine.getText(),Toast.LENGTH_LONG).show();
                mine.setText("Hey you clicked on the textview");
*/
                Intent changePage = new Intent(login.this,SecondActivity.class);
                changePage.putExtra("randomname","randomvalue");
                startActivity(changePage);
            }};

        mine.setOnClickListener(onClickListener);
    }


}
