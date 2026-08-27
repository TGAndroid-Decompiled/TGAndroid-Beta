package v5;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import c2.t0;
import java.util.concurrent.atomic.AtomicBoolean;

public final class j extends t0 {

    public final Context f48806a;

    public final d f48807b;

    public j(d dVar, Context context) {
        super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper(), 4);
        this.f48807b = dVar;
        this.f48806a = context.getApplicationContext();
    }

    @Override
    public final void handleMessage(Message message) {
        PendingIntent activity;
        int i10 = message.what;
        if (i10 != 1) {
            Log.w("GoogleApiAvailability", "Don't know how to handle this message: " + i10);
            return;
        }
        int i11 = e.f48794a;
        d dVar = this.f48807b;
        Context context = this.f48806a;
        int iD = dVar.d(context, i11);
        AtomicBoolean atomicBoolean = g.f48797a;
        if (iD == 1 || iD == 2 || iD == 3 || iD == 9) {
            Intent intentB = dVar.b(context, "n", iD);
            if (intentB == null) {
                activity = null;
            } else {
                activity = PendingIntent.getActivity(context, 0, intentB, Build.VERSION.SDK_INT >= 23 ? 201326592 : 134217728);
            }
            dVar.h(context, iD, activity);
        }
    }
}
