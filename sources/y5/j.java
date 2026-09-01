package y5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;
public final class j extends a7.e {
    public final Context f50781a;
    public final d f50782b;

    public j(y5.d r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: y5.j.<init>(y5.d, android.content.Context):void");
    }

    @Override
    public final void handleMessage(Message message) {
        int i10;
        PendingIntent activity;
        int i11 = message.what;
        if (i11 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i11);
            return;
        }
        int i12 = e.f50768a;
        d dVar = this.f50782b;
        Context context = this.f50781a;
        int d = dVar.d(context, i12);
        AtomicBoolean atomicBoolean = g.f50771a;
        if (d != 1 && d != 2 && d != 3 && d != 9) {
            return;
        }
        Intent b10 = dVar.b(context, "n", d);
        if (b10 == null) {
            activity = null;
        } else {
            if (Build.VERSION.SDK_INT >= 23) {
                i10 = 201326592;
            } else {
                i10 = 134217728;
            }
            activity = PendingIntent.getActivity(context, 0, b10, i10);
        }
        dVar.h(context, d, activity);
    }
}
