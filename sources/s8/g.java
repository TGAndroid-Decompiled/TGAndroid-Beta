package s8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class g extends BroadcastReceiver {
    public static final AtomicReference f47466b = new AtomicReference();
    public final Context f47467a;

    public g(Context context) {
        this.f47467a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (h.f47468k) {
            try {
                Iterator it = ((a0.e) h.f47469l.values()).iterator();
                while (it.hasNext()) {
                    ((h) it.next()).e();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.f47467a.unregisterReceiver(this);
    }
}
