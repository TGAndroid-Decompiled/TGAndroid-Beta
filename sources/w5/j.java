package w5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Message;
import android.util.Log;
import c2.v0;
public final class j extends v0 {
    public final Context f49780a;
    public final d f49781b;

    public j(w5.d r2, android.content.Context r3) {
        throw new UnsupportedOperationException("Method not decompiled: w5.j.<init>(w5.d, android.content.Context):void");
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
        int i12 = e.f49768a;
        d dVar = this.f49781b;
        Context context = this.f49780a;
        int d = dVar.d(context, i12);
        int i13 = g.f49774e;
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
