package com.collegesucks.dobbyhelps;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.icu.util.TimeUnit;
import android.util.Log;
import android.widget.Toast;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Calendar;

public class ReminderTasks {

    private static final int PENDING_INTENT_ID = 223;

    public static void setAlarmTask(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(Context.ALARM_SERVICE);
        Intent intent = new Intent(context,NotificationService.class);
        intent.setAction(NotificationService.ACTION_SEND_NOTIFICATION);
        PendingIntent pendingIntent = PendingIntent.getService(context,PENDING_INTENT_ID,intent,PendingIntent.FLAG_UPDATE_CURRENT);

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(System.currentTimeMillis());
        calendar.set(Calendar.HOUR_OF_DAY,12);
        calendar.set(Calendar.MINUTE,50);

        Log.e("set-alarm-task-invoked","SetAlarmTask invoked successfully");
        alarmManager.setRepeating(AlarmManager.RTC_WAKEUP,calendar.getTimeInMillis(),AlarmManager.INTERVAL_DAY,pendingIntent);
        //Toast.makeText(context,"Repeating alarm set up",Toast.LENGTH_LONG).show();
    }

}
