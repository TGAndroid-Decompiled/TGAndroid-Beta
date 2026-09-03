package w8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f extends BroadcastReceiver {
    public static final AtomicReference f46556b = new AtomicReference();
    public final Context f46557a;

    public f(Context context) {
        this.f46557a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f46558k) {
            try {
                Iterator it = ((a0.e) g.f46559l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f46557a.unregisterReceiver(this);
    }
}
