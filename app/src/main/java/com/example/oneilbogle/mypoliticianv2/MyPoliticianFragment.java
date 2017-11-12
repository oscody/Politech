package com.example.oneilbogle.mypoliticianv2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import static com.example.oneilbogle.mypoliticianv2.MainActivity.zip;

public class MyPoliticianFragment extends Fragment {


    TextView Polittitle,briefinfo,mybio;
    ImageButton MYPoltican, myTwitter,Myfacebook;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater,
                             @Nullable ViewGroup container,
                             @Nullable Bundle savedInstancesState) {

        View view = inflater.inflate(R.layout.activitymypolitician,container,false );

        myTwitter =  (ImageButton) view.findViewById(R.id.imgprofile);
        MYPoltican =  (ImageButton) view.findViewById(R.id.edtborough);
        Myfacebook =  (ImageButton) view.findViewById(R.id.imgfb);


        Polittitle =  (TextView) view.findViewById(R.id.tvname);
        briefinfo =  (TextView) view.findViewById(R.id.tvinfo);
        mybio =  (TextView) view.findViewById(R.id.tvtbio);



        List<PoliticianDAO> data = loaddata();

        for(int i = 0; i<data.size(); i++){
            PoliticianDAO dao = data.get(i);
            if(dao.myname.equals(zip)){
                briefinfo.setText(dao.myinfo);
                mybio.setText(dao.Mybio);
//                MYPoltican.setBackgroundResource(dao.UserIcon);
                Polittitle.setText(dao.myname);
                Toast.makeText(getContext(), "Made it here", Toast.LENGTH_LONG).show();
            }
        }
        return view;

    }



    public static List<PoliticianDAO> loaddata(){


        List<PoliticianDAO> data = new ArrayList<>();



        PoliticianDAO politician1 = new PoliticianDAO(R.drawable.billperkins,
                "Steven Matteo",
                "718-980-1017, 900 South Avenue, Suite 403\n" +
                        "Staten Island, NY 10314",
                "Focusing on improving the quality of life and providing better government services for his constituents, Matteo has had many accomplishments early\n"
                        + "in his first term, including: passing legislation that provides lifesaving Automated External Defibrillators (AEDs) to thousands of little league\n"
                        + "teams in the city free of charge; working with the Department of Sanitation to create the city’s first eWaste curbside collection program for Staten\n"
                        + "Island, which is slated to be made permanent and expanded citywide over the coming years; collaborating with his colleagues to secure an additional\n"
                        + "$241 million to repair the city’s crumbling roads; creating a West Shore Industrial Business Improvement District (BID)and New Dorp BID and several\n"
                        + "local merchant groups to help spur economic development in the borough; securing funding for a borough ‘Clean Team’ and spearheading efforts to remove\n"
                        + "litter and debris on Staten Island and across the city; advocating for changes to expedite post-Sandy recovery and resiliency projects, including working\n"
                        +  "with Staten Island Borough President James Oddo, and then-Minority Leader Ignizio to secure more than $28 million to make Staten Island University Hospital safe from future storms\n",
                "https://twitter.com/StevenMatteo?ref_src=twsrc%5Egoogle%7Ctwcamp%5Eserp%7Ctwgr%5Eauthor",
                "https://www.facebook.com/steven.matteo.7");








        PoliticianDAO politician2 = new PoliticianDAO(R.drawable.steven,
                "Bill Perkins",
                "212-678-4505, 163 West 125th Street, Room 729",
                "A lifelong resident of Harlem, Bill Perkins started his political career as a community activist and is known for his tenacious and unyielding commitment to serving the community.\n" +
                        " The young, elderly and the most vulnerable New Yorkers have always been Bill’s legislative priorities.From 1998-2005, Bill Perkins served on the New York City Council.\n" +
                        "  During his initial tenure, he was the third highest ranking member of the Council serving as the Deputy Majority Leader.\n" +
                        "  As Deputy Majority Leader, Senator Perkins was the prime sponsor of the Childhood Lead Paint Poisoning Prevention Act of 2004 which protects children from the deadly effects of lead paint in their homes.\n" +
                        "  Thanks to his efforts, New York has the strongest lead paint prevention law in the country.",
                "https://twitter.com/billperkinsnyc?lang=en",
                "https://www.facebook.com/people/Bill-Perkins/100018744134062");


        data.add(politician1);
        data.add(politician2);


           return data;
    }




}
