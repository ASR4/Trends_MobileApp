package com.example.mchattopadhyay.trendy_10;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new gridCustomization(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent,
                                    View v, int position, long id){

                // Send intent to SingleViewActivity
//                Intent i = new Intent(getApplicationContext(), InfoPage.class);

                // Calling google chrome app : hardcoded the below link for all the grids
                String urlString= "https://www.google.com/amp/s/profootballtalk.nbcsports.com/2018/08/07/could-khalil-mack-be-traded/amp/";
                Intent intent=new Intent(Intent.ACTION_VIEW, Uri.parse(urlString));

                // Pass image index
//              i.putExtra("id", position);

                startActivity(intent);
            }
        });
    }




}
