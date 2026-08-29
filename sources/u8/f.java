package u8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f extends BroadcastReceiver {
    public static final AtomicReference f49127b = new AtomicReference();
    public final Context f49128a;

    public f(Context context) {
        this.f49128a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f49129k) {
            try {
                Iterator it = ((a0.e) g.f49130l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f49128a.unregisterReceiver(this);
    }
}
