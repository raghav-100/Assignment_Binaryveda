package com.example.raghav.assignment_binaryveda;

import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.google.gson.Gson;

import de.hdodenhof.circleimageview.CircleImageView;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    //Tab Variables
    TabLayout tabLayout;
    ViewPager viewPager;
    Context mContext;
    SkillFragment skillFragmentConstructor;


    //Page content textViews
    String Name = "";
    String Designation = "";
    String Locaton = "";
    String Image = "";
    String Qualification = "";
    String Experience = "";
    String ExpectedCTC = "";
    String CurrentFirm = "";
    String SkillSet = "";
    String WorkFunctions = "";
    String Industry = "";
    String test = "Cow";
    String Roles="";


    TextView textName;
    TextView textDesination;
    TextView textLocation;
    TextView textQualification;
    TextView textExperience;
    TextView textCTC;
    TextView textCurrentlyWorking;
    TextView textTextDesination2;
    CircleImageView ImageProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        FragmentManager fm2 = getFragmentManager();


        //======CONTENT DEFINING=====

        textName = (TextView) findViewById(R.id.textName);
        textDesination = (TextView) findViewById(R.id.textDesignation);
        textLocation = (TextView) findViewById(R.id.textLocation);
        textQualification = (TextView) findViewById(R.id.textQualification);
        textExperience = (TextView) findViewById(R.id.textExperience);
        textCTC = (TextView) findViewById(R.id.textCTC);
        textCurrentlyWorking = (TextView) findViewById(R.id.textCurrentlyWorking);
        textTextDesination2 = (TextView) findViewById(R.id.textRole);
        ImageProfile = (CircleImageView) findViewById(R.id.image_profile);

        //===== API CALLING SEGMENT ===

        getDetails();
        Log.e("Name value is ", Name);

        //===== CONTENT DECLARATION AND SETTING ======


        mContext = getApplicationContext();

        // TabLayout Segment Below

        tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        viewPager = (ViewPager) findViewById(R.id.viewPager);

        /*
        Glide.with(mContext)
                .load("https://storage.googleapis.com/icif-cs/hunt/user/image20190524105658.jpeg")
                .into(ImageProfile);
        */
        //ImageLoader();


        tabLayout.addTab(tabLayout.newTab().setText("Skill Set"));
        tabLayout.addTab(tabLayout.newTab().setText("Work function"));
        tabLayout.addTab(tabLayout.newTab().setText("Industry"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);


        final MyAdapter adapter = new MyAdapter(this, getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                //viewPager.setOffscreenPageLimit(2);
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }


    public void Confirm_Click(View view) {
        Toast.makeText(this, "You have selected to Confirm", Toast.LENGTH_SHORT).show();
    }

    public void Edit_Click(View view) {
        Toast.makeText(this, "You have selected to Edit the Profile", Toast.LENGTH_SHORT).show();
    }


    public void ImageLoader(String image_url) {
        Glide.with(mContext)
                .load(image_url)
                .into(ImageProfile);
    }


    private void getDetails() {

        final MainActivity MA = new MainActivity();


        //String token = "eyJ0eXAiOiJKV1QiLCJhbGciOiJSUzI1NiIsImp0aSI6IjE4MWU5ZmNlOTg2NGUzYWE1OWM5MjU2OTQ3ZjViMDdhNmNhZmE4MmY1ZGQ3ZjdkZDY0MmUzMzkwNWMyOWEzNGYzYWY0NmIyMWY1N2RkMjgyIn0.eyJhdWQiOiIzIiwianRpIjoiMTgxZTlmY2U5ODY0ZTNhYTU5YzkyNTY5NDdmNWIwN2E2Y2FmYTgyZjVkZDdmN2RkNjQyZTMzOTA1YzI5YTM0ZjNhZjQ2YjIxZjU3ZGQyODIiLCJpYXQiOjE1NjMyNzg5NDksIm5iZiI6MTU2MzI3ODk0OSwiZXhwIjoxNTk0OTAxMzQ5LCJzdWIiOiI5OTcwIiwic2NvcGVzIjpbXX0.Iod7Rv5VTMcnsMKHXdo5KN3ojAZQvIub6RUpfaDI8GosLaVKqon_9rFYcLVSU-w-Jt-EdwhhUb2zfloNhZP-7PiAtwE7qr3xpRUutkO154mFiEAiUh_WxUUz3e5VuuVsFUN4TPu6Qzf-qMtxR-SZsPUUVL7hvLjIGxxN-0498QoDom0jGKiuInoiJsE9lcTkOqpM1d6Tc2nStF350A5-YVo4ZhDW5ZOYwsnyjsYpprwZNFjN3vgRAokgnHMo4hNANSrVvtvFSj-g3uF6pozOm5GOn9YC_SVnEq6MdJaCVnkDYO9cnA63uP_sRZIvFx3aA0oVXNGWbqnCnSObAqOcaEPfABCqFpjal_-Q9CJ-MIN0fOMQ0z2Z8YPf_UOQHTSXlxa-uK9X2iN0bGUEVpYf9f8kULzSvnWcTsUD_t97It0uShDBv7A4x5MRRWrF7s8jyqSw0Vyg_dBV5nxItaspHsO-34vQs_1O8w_RfeCpMmLSyXZmxMWx-VS1fxyMVfVcX73G7xNTZFlyDbwyWqDftYlNUX3GgYifX3zVBfjxbIHXkygSj8kSjBsmkNd1Tjq_11DNwHr8tuv92z5ka5Gs5BZh485jHnCWtzU0f1rAIdyB7m9Eh6m2FSyvUkHC-RkIshf1M8SH8wEcaSxgQWW1kw96Dzu7O4zizfa6Bdiawd4";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ApiModule.Base_url)
                .addConverterFactory(GsonConverterFactory.create())
                .build();


        ApiModule api = retrofit.create(ApiModule.class);
        //Call<List<Details>> call = api.getDetails("4514","Bearer "+ token);
        //Call<List<Details>> call = api.getDetails();
        Call<Details> call = api.getDetails();


        call.enqueue(new Callback<Details>() {
            @Override
            public void onResponse(Call<Details> call, Response<Details> response) {

                Details recieved_details = response.body();


                Log.i("OBJECTED NAME", MA.Name);
                MA.Name = new Gson().toJson(recieved_details.getData().getName().toString()).replace("\"", "");
                MA.Designation = new Gson().toJson(recieved_details.getData().getDesignation().getName().toString()).replace("\"", "");
                MA.Locaton = new Gson().toJson(recieved_details.getData().getLocation().toString()).replace("\"", "");
                MA.Qualification = new Gson().toJson(recieved_details.getData().getHighestQualification().getName().toString()).replace("\"", "");
                MA.Experience = new Gson().toJson(recieved_details.getData().getExperience().toString()).replace("\"", "");
                MA.ExpectedCTC = new Gson().toJson(recieved_details.getData().getExpectedCtc().toString()).replace("\"", "");
                MA.CurrentFirm = new Gson().toJson(recieved_details.getData().getLastCompany().getName()).replace("\"", "");
                MA.Image = new Gson().toJson(recieved_details.getData().getImage().toString()).replace("\"", "");



                ImageLoader(MA.Image);
                Log.e("Image URL", MA.Image);
                textName.setText(MA.Name);
                textDesination.setText(MA.Designation);
                textLocation.setText(MA.Locaton);
                textQualification.setText(MA.Qualification);
                textExperience.setText(MA.Experience);
                textCTC.setText(MA.ExpectedCTC);
                textCurrentlyWorking.setText(MA.CurrentFirm.replace("\\u0026", "&"));
                //textTextDesination2.setText(MA.Designation);


                //=======  GETTING AND SETTING LIST TYPE DETAILS =======


                int skillSize = recieved_details.getData().getSkills().size();
                int rolesSize = recieved_details.getData().getRoles().size();
                int workSize = recieved_details.getData().getWorkFunctions().size();
                int industrySize = recieved_details.getData().getIndustries().size();


                for(int i=0; i< rolesSize; i++)
                {
                    MA.Roles = MA.Roles + (new Gson().toJson(recieved_details.getData().getRoles().get(i).getName().toString())).replace("\"","") + " | ";

                }
                textTextDesination2.setText(MA.Roles);


                for (int i = 0; i < skillSize; i++)
                {
                    MA.SkillSet = MA.SkillSet + (new Gson().toJson(recieved_details.getData().getSkills().get(i).getName()).toString()).replace("\"", "") + " | ";
                }

                for(int i=0; i< workSize; i++)
                {
                    MA.WorkFunctions = MA.WorkFunctions + (new Gson().toJson(recieved_details.getData().getWorkFunctions().get(i).getName().toString())).replace("\"","") + " | ";

                }

                for(int i=0; i< industrySize; i++)
                {
                    MA.Industry = MA.Industry + (new Gson().toJson(recieved_details.getData().getIndustries().get(i).getName().toString())).replace("\"","") + " | ";

                }


                System.out.println("Skills: "+ MA.SkillSet +"\nWork Function: "+ MA.WorkFunctions+ "\nIndustries: "+MA.Industry);


                //MA.test = MA.SkillSet;
                //skillFragmentConstructor = new SkillFragment();
                //skillFragmentConstructor.addSet(MA.SkillSet);


            }
//========================================================


            @Override
            public void onFailure(Call<Details> call, Throwable t) {

                Log.e("JSON ERROR", "FAIL TO RECIEVE JSON FILE");
                Log.e("Error", t.getMessage());


            }
        });
    }

}

