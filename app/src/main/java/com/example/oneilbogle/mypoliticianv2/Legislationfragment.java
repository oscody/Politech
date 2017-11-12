//package com.example.oneilbogle.mypoliticianv2;
//
//import android.os.Bundle;
//import android.support.annotation.Nullable;
//import android.support.v4.app.Fragment;
//import android.view.LayoutInflater;
//import android.view.View;
//import android.view.ViewGroup;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import org.json.JSONArray;
//import org.json.JSONException;
//import org.json.JSONObject;
//
//public class Legislationfragment extends Fragment {
//
//
//    TextView tvLegis1, tvLegis2, tvLegis3;
//
//
//    @Nullable
//    @Override
//    public View onCreateView(LayoutInflater inflater,
//                             @Nullable ViewGroup container,
//                             @Nullable Bundle savedInstancesState) {
//
//
//
//        View view = inflater.inflate(R.layout.activitylegislationfragment,container,false );
//
//
//
//        tvLegis1 =  (TextView) view.findViewById(R.id.tvLegis1);
//        tvLegis2 =  (TextView) view.findViewById(R.id.tvLegis2);
//        tvLegis2 =  (TextView) view.findViewById(R.id.tvLegis3);
//
//
//        return view;
//
//
//
//        try {
//
//
//            String jsonLegData = Legislationdao.LegData;
//
//
//                JSONArray jsonArray = new JSONArray(jsonLegData);
//                for (int i = 0; i < jsonArray.length(); i++) {
//                    JSONObject data = jsonArray.getJSONObject(i);
//                    String legislation = data.getString("legislation");
//
//
//                        tvborough.setText(legislation);
//
//
//
//
//
//                }
//
//
//            //Toast.makeText(this, borough, Toast.LENGTH_LONG);
//        } catch (JSONException e) {
//            e.printStackTrace();
//
//        }
//    }
//
//}