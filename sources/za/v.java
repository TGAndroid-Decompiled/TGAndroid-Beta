package za;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
public final class v extends BroadcastReceiver {
    public w f60333a;
    public final w f60334b;

    public v(w wVar, w wVar2) {
        this.f60334b = wVar;
        this.f60333a = wVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f60334b.f60337a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override
    public final synchronized void onReceive(android.content.Context r5, android.content.Intent r6) {
        throw new UnsupportedOperationException("Method not decompiled: za.v.onReceive(android.content.Context, android.content.Intent):void");
    }
}
