package w8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f extends BroadcastReceiver {
    public static final AtomicReference f46474b = new AtomicReference();
    public final Context f46475a;

    public f(Context context) {
        this.f46475a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f46476k) {
            try {
                Iterator it = ((a0.e) g.f46477l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f46475a.unregisterReceiver(this);
    }
}
