package t8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class g extends BroadcastReceiver {

    public static final AtomicReference f48115b = new AtomicReference();

    public final Context f48116a;

    public g(Context context) {
        this.f48116a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f48117k) {
            try {
                Iterator it = ((a0.e) h.f48118l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f48116a.unregisterReceiver(this);
    }
}
