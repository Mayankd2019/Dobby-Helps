package com.collegesucks.dobbyhelps;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.AsyncTaskLoader;
import androidx.loader.content.Loader;

import java.util.ArrayList;

public class RecyclerViewDataLoader implements LoaderManager.LoaderCallbacks<ArrayList<Subject>> {

    private Context mContext;
    RecyclerViewDataLoader(Context context){
        mContext = context;
    }
    @NonNull
    @Override
    public Loader<ArrayList<Subject>> onCreateLoader(int id, @Nullable Bundle args) {
        return new AsyncTaskLoader<ArrayList<Subject>>(mContext) {
            @Nullable
            @Override
            public ArrayList<Subject> loadInBackground() {
                return null;
            }
        };
    }

    @Override
    public void onLoadFinished(@NonNull Loader<ArrayList<Subject>> loader, ArrayList<Subject> data) {

    }

    @Override
    public void onLoaderReset(@NonNull Loader<ArrayList<Subject>> loader) {

    }
}
