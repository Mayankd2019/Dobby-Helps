package com.collegesucks.dobbyhelps;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;
import androidx.work.WorkRequest;

import android.os.Bundle;
import android.system.StructUtsname;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private static final String GROUP = "Group key";
    private static final String DAY_OF_THE_WEEK = "Day of the Week key" ;
    private static int weekDay;

    private Spinner spinnerForGroupSelection;
    private TextView dayDisplayTv;
    private RecyclerView mRecyclerView;
    private LinearLayoutManager mLayoutManager;
    private RecyclerViewAdapter mAdapter;




    private int group =1 ;
    private int dayOfTheWeek =0 ;
    private TimeTableData data = new TimeTableData();
    ArrayList<Subject> mSubjects ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(savedInstanceState != null){
            group = savedInstanceState.getInt(GROUP);
            dayOfTheWeek = savedInstanceState.getInt(DAY_OF_THE_WEEK);
        }
        mSubjects = new ArrayList<>();
        //displayingDayOfTheWeek(dayOfTheWeek);
        setUpSpinner();
        setUpRecyclerView();
        //LoaderManager.getInstance(this).initLoader(LOADER_ID_FOR_RECYCLER_VIEW_DATA_LOADING,null,RecyclerViewDataLoader.class)
        //setUpWorkManager();
        ReminderTasks.setAlarmTask(this);
    }


    @Override
    protected void onResume() {
        super.onResume();
        displayingDayOfTheWeek(dayOfTheWeek);
    }

    private void setUpRecyclerView() {
        mRecyclerView = findViewById(R.id.timetable_recycler_view);
        mLayoutManager = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mAdapter = new RecyclerViewAdapter(this);
        mRecyclerView.setAdapter(mAdapter);
        ArrayList<Subject> mSubjects = data.getData(group,dayOfTheWeek);
        mAdapter.setAdapterSettings(mSubjects);
    }

    private void setUpSpinner() {
        dayDisplayTv = findViewById(R.id.day_display_tv);
        spinnerForGroupSelection = findViewById(R.id.group_selected_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.spinner_options,android.R.layout.simple_spinner_item);

        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinnerForGroupSelection.setAdapter(adapter);
        spinnerForGroupSelection.setOnItemSelectedListener(this);
    }

    private void setUpWorkManager() {
        //notifyUsersForClassWorkRequest  = new PeriodicWorkRequest.
               //Builder(NotificationSendWork.class,10, TimeUnit.SECONDS).build();

        //WorkManager.getInstance(this).enqueue(notifyUsersForClassWorkRequest);
    }

    @Override
    protected void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(DAY_OF_THE_WEEK,dayOfTheWeek);
        outState.putInt(GROUP,group);
    }

    public void mondaySelected(View view){
        dayOfTheWeek = 1;
        String groupS = (String)spinnerForGroupSelection.getSelectedItem();
        getGroupFromStringInSpinner(groupS);
        displayingDayOfTheWeek(dayOfTheWeek);
        loadData(group,dayOfTheWeek);
    }
    public void tuesdaySelected(View view){
        dayOfTheWeek = 2;
        String groupS = (String)spinnerForGroupSelection.getSelectedItem();
        getGroupFromStringInSpinner(groupS);
        displayingDayOfTheWeek(dayOfTheWeek);
        loadData(group,dayOfTheWeek);
    }
    public void wednesdaySelected(View view){
        dayOfTheWeek = 3;
        String groupS = (String)spinnerForGroupSelection.getSelectedItem();
        getGroupFromStringInSpinner(groupS);
        displayingDayOfTheWeek(dayOfTheWeek);
        loadData(group,dayOfTheWeek);
    }
    public void thursdaySelected(View view){
        dayOfTheWeek = 4;
        String groupS = (String)spinnerForGroupSelection.getSelectedItem();
        getGroupFromStringInSpinner(groupS);
        displayingDayOfTheWeek(dayOfTheWeek);
        loadData(group,dayOfTheWeek);
    }
    public void fridaySelected(View view){

        dayOfTheWeek = 5;
        String groupS = (String)spinnerForGroupSelection.getSelectedItem();
        getGroupFromStringInSpinner(groupS);
        displayingDayOfTheWeek( dayOfTheWeek);
        loadData(group,dayOfTheWeek);
    }

    public void defaultSelected(View view) {
        dayOfTheWeek = 0;
        loadData(group,dayOfTheWeek);
        group = 1 ;
        displayingDayOfTheWeek(dayOfTheWeek);
    }

    public void displayingDayOfTheWeek(int dayOfTheWeek){
        switch (dayOfTheWeek){
            case 0 :
                dayDisplayTv.setText("Default");
                break;
            case 1 :
                dayDisplayTv.setText("Monday");
                break;
            case 2 :
                dayDisplayTv.setText("Tuesday");
                break;
            case 3  :
                dayDisplayTv.setText("Wednesday");
                 break;
            case 4 :
                dayDisplayTv.setText("Thursday");
                break;
            case 5 :
                dayDisplayTv.setText("Friday");
                break;
        }
    }

    private void loadData(int group, int dayOfTheWeek) {
        mSubjects = data.getData(group,dayOfTheWeek);
        mAdapter.setAdapterSettings(mSubjects);
    }

    private void getGroupFromStringInSpinner(String groupS) {
        if(groupS.equals("G1")){
            group = 1;
        } else if(groupS.equals("G2")) {
            group = 2;
        } else  if(groupS.equals("G3")){
            group = 3;
        } else if(groupS.equals("G4")){
            group = 4;
        } else {
            group = 0;
        }
    }


    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String groupS = (String) parent.getSelectedItem();
        getGroupFromStringInSpinner(groupS);
        loadData(group,dayOfTheWeek);
        //Toast.makeText(this,"item selected confirmed",Toast.LENGTH_LONG).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        group = 1;
        dayOfTheWeek = 0;
        loadData(1, 0);
    }

}
