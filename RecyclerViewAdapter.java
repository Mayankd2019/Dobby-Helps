package com.collegesucks.dobbyhelps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {

    private ArrayList<Subject> subjects;
    private Context mContext;

    public RecyclerViewAdapter(Context context){
        mContext = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(mContext).inflate(R.layout.timetable_rv_card_layout,parent,false);
        return new RecyclerViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position) {
        Subject subject = subjects.get(position);
        holder.startTv.setText(subject.getStartTime());
        holder.endTv.setText(subject.getEndTime());
        holder.subTv.setText(subject.getSubjectName());
        holder.linkTv.setText(subject.getMeetLink());
    }

    @Override
    public int getItemCount() {
        if(subjects != null) {
            return subjects.size();
        }
        return 0;
    }

    public void setAdapterSettings(ArrayList<Subject> mSubjects) {
        subjects = mSubjects;
        notifyDataSetChanged();
    }

    public static class  RecyclerViewHolder extends RecyclerView.ViewHolder {
        TextView startTv;
        TextView endTv;
        TextView subTv;
        TextView linkTv;
        public RecyclerViewHolder(@NonNull View itemView) {
            super(itemView);
            startTv = itemView.findViewById(R.id.class_start_time_tv);
            endTv = itemView.findViewById(R.id.class_end_time_tv);
            subTv = itemView.findViewById(R.id.subject_tv);
            linkTv = itemView.findViewById(R.id.link_tv);
        }
    }
}
