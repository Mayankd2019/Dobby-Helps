package com.collegesucks.dobbyhelps;


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import androidx.core.content.ContextCompat;

import java.time.LocalDate;
import java.util.Date;

public class NotificationUtils {

    private static final String NOTIFICATION_CHANNEL_ID = "notification_channel_id";
    private static final int NOTIFICATION_ID = 762;

    public static void notifyUserToAttendClass(Context context,final String title,final String text){
        NotificationManager notificationManager = (NotificationManager)context.getSystemService(Context.NOTIFICATION_SERVICE);

        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            NotificationChannel notificationChannel = new NotificationChannel(NOTIFICATION_CHANNEL_ID,
                    context.getString(R.string.main_notification_channel_name),NotificationManager.IMPORTANCE_HIGH);
            notificationManager.createNotificationChannel(notificationChannel);
        }

        Notification.Builder notificationBuilder = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
            notificationBuilder = new Notification.Builder(context,NOTIFICATION_CHANNEL_ID)
                    .setColor(ContextCompat.getColor(context, R.color.colorPrimary))
                    .setSmallIcon(R.drawable.ic_launcher_foreground)
                    .setLargeIcon(largeIcon(context))
                    .setContentTitle(title)
                    .setContentText(text)
                    .setAutoCancel(true);
        }

        notificationManager.notify(NOTIFICATION_ID, notificationBuilder.build());
    }

    private static Bitmap largeIcon(Context context) {
        Resources res = context.getResources();
        Bitmap largeIcon = BitmapFactory.decodeResource(res, R.drawable.ic_launcher_foreground);
        return largeIcon;
    }

    public void howToSendNotificatioin(){

    }
}
