package u5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import c2.u0;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j extends u0 {
    public final Context f48121a;
    public final d f48122b;

    public j(u5.d r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: u5.j.<init>(u5.d, android.content.Context):void");
    }

    @Override
    public final void handleMessage(Message message) {
        int i9;
        PendingIntent activity;
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = e.f48109a;
        d dVar = this.f48122b;
        Context context = this.f48121a;
        int d = dVar.d(context, i11);
        AtomicBoolean atomicBoolean = g.f48112a;
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            return;
        }
        Intent b10 = dVar.b(context, "n", d);
        if (b10 == null) {
            activity = null;
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                i9 = 201326592;
            } else {
                i9 = 134217728;
            }
            activity = PendingIntent.getActivity(context, 0, b10, i9);
        }
        dVar.h(context, d, activity);
    }
}
