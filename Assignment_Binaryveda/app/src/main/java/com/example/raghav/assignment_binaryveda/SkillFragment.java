package com.example.raghav.assignment_binaryveda;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by raghav on 7/24/19.
 */

public class SkillFragment extends Fragment {

    String PosterText ="";

    TextView textSkillFragment;
    String Inside_Text = "Alpha";
    View view;

    public SkillFragment() {
        // Required empty public constructor


    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.fragment_skill,container,false);
        textSkillFragment = (TextView)view.findViewById(R.id.textSkillFragment);
        textSkillFragment.setText("This is the Skill Section");
        return  view;
    }





}
