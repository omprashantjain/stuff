package in.mubble.mubbletest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

public class EventReceiver extends BroadcastReceiver {

  public static final String 
    ACTION_LOG_DATA_USAGE = "LOG-DATA-USAGE";
  
  @Override
  public void onReceive(Context context, Intent intent) {
     
    String action = intent.getAction();
    Log.e(this.getClass().getSimpleName(), "Received " + action);

    if (action.equals(ACTION_LOG_DATA_USAGE)) {
      MainActivity.allData.put(MubbleUtil.getInstalledApplicationsInfo());
    }
  }
  
}