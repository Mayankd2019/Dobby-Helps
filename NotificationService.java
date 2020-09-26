package com.collegesucks.dobbyhelps;

import android.app.IntentService;
import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

import androidx.annotation.Nullable;

public class NotificationService extends IntentService {
    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */

    public static final String ACTION_SEND_NOTIFICATION = "SEND NOTIFICATION";
    String mAction;
    public NotificationService(String name,Context context) {
        super(name);
    }

    @Override
    protected void onHandleIntent(@Nullable Intent intent) {
        if(mAction.equals(ACTION_SEND_NOTIFICATION)){
            NotificationUtils.notifyUserToAttendClass(getApplicationContext(),"ASN","Ae yede class hai");
            //Toast.makeText(getApplicationContext(),"I  think now  it should have beend one",Toast.LENGTH_SHORT).show();
        }
    }
}
