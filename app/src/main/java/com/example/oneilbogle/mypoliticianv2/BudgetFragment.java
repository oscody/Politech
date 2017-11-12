package com.example.oneilbogle.mypoliticianv2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by oneilbogle on 11/12/17.
 */

public class BudgetFragment extends Fragment {


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstancesState) {



        View view = inflater.inflate(R.layout.activitybudgetfragment,container,false );




        return view;
    }
}
