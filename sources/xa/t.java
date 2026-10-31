package xa;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Build;
import android.util.Log;
public final class t extends BroadcastReceiver {
    public u f53576a;
    public final u f53577b;

    public t(u uVar, u uVar2) {
        this.f53577b = uVar;
        this.f53576a = uVar2;
    }

    public final void a() {
        if (Log.isLoggable("FirebaseMessaging", 3) || (Build.VERSION.SDK_INT == 23 && Log.isLoggable("FirebaseMessaging", 3))) {
            Log.d("FirebaseMessaging", "Connectivity change received registered");
        }
        this.f53577b.f53580a.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
    }

    @Override
    public final synchronized void onReceive(android.content.Context r5, android.content.Intent r6) {
        throw new UnsupportedOperationException("Method not decompiled: xa.t.onReceive(android.content.Context, android.content.Intent):void");
    }
}
