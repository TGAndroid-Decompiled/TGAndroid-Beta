package w8;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;
public final class f extends BroadcastReceiver {
    public static final AtomicReference f49448b = new AtomicReference();
    public final Context f49449a;

    public f(Context context) {
        this.f49449a = context;
    }

    @Override
    public final void onReceive(Context context, Intent intent) {
        synchronized (g.f49450k) {
            try {
                Iterator it = ((a0.e) g.f49451l.values()).iterator();
                while (it.hasNext()) {
                    ((g) it.next()).e();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.f49449a.unregisterReceiver(this);
    }
}
