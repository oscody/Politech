package com.example.oneilbogle.mypoliticianv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {


    public static String zip = null ;

    private static final int sleep = 9000;

    EditText zipcodefeild;
    Button msubmit;

    TextView tvborough, tvdist, tvname, tvpolitical;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);


        final EditText zipcodefeild = (EditText) findViewById(R.id.edtzipcode);
        Button msubmit = (Button) findViewById(R.id.Submitbtn);

        final TextView tvborough = (TextView) findViewById(R.id.edtborough);
        final TextView tvdist = (TextView) findViewById(R.id.eddistrict);
        final TextView tvname = (TextView) findViewById(R.id.edtname);
        final TextView tvpolitical = (TextView) findViewById(R.id.edtparty);


        Toast.makeText(this, DAO.JSON, Toast.LENGTH_LONG).show();

        tvname.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {



                String text = tvname.getText().toString();
                if(text.equals("Steven Matteo")){

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    zip = text;
                    startActivity(intent);
                    //go to that page
                }else if(text.equals("Bill Perkins")){

                    Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                    zip = text;
                    startActivity(intent);

                }else{
                    Toast.makeText(getApplicationContext(), "invalid choice", Toast.LENGTH_LONG).show();
                }
            }
        });

        msubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {


                    String jsonData = DAO.JSON;
                    String userZip = zipcodefeild.getText().toString();
                    if(validzipCode(userZip)) {
                        JSONArray jsonArray = new JSONArray(jsonData);
                        for (int i = 0; i < jsonArray.length(); i++) {
                            JSONObject data = jsonArray.getJSONObject(i);
                            String borough = data.getString("borough");
                            String district = data.getString("district");
                            String name = data.getString("name");
                            String politicalparty = data.getString("political_party");
                            String zipcodedoa = data.getString("zipcode");
                            if (userZip.equals(zipcodedoa)) {
                                tvborough.setText(borough);
                                tvdist.setText(district);
                                tvname.setText(name);
                                tvpolitical.setText(politicalparty);

                                return;
                            }

                        }
                    }else {
                        Toast.makeText(getApplicationContext(), "Information not available for the zipcode", Toast.LENGTH_LONG).show();
                    }

                    //Toast.makeText(this, borough, Toast.LENGTH_LONG);
                } catch (JSONException e) {
                    e.printStackTrace();

                }


            }
        });


    }


    private boolean validzipCode(String zipcode) {
        if (TextUtils.isEmpty(zipcode)) {
            return false;
        }
        return true;
    }


}
