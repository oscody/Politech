package com.example.oneilbogle.mypoliticianv2;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import static com.example.oneilbogle.mypoliticianv2.MainActivity.zip;

public class Main2Activity extends AppCompatActivity {

    public static final String INFO = "MYPOLITECH";

    private  SectionsPageAdapter mSectionsPageAdapter;


    private  ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);




        Intent intent = getIntent();

        final String politican = intent.getStringExtra(zip);

        Toast.makeText(this, zip, Toast.LENGTH_LONG).show();

        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());


        //set up the viewPager with the section adapter
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);



    }



    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new MyPoliticianFragment(),"BIO");
        adapter.addFragment(new Legislationfragment(), "LEGISLATION");
        adapter.addFragment(new BudgetFragment(), "BUDGET");
        viewPager.setAdapter(adapter);


    }




}
