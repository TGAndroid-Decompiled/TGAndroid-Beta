package y3;

import android.util.Log;
import b8.qb;
import java.util.concurrent.TimeoutException;
import z9.y;
public final class b {
    public final Object f58909a;

    public b(Object obj) {
        this.f58909a = obj;
    }

    public void a(ha.c cVar, Thread thread, Throwable th2) {
        z9.m mVar = (z9.m) this.f58909a;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            qb.a();
            try {
                y.a(mVar.f60198e.f286a.b(new z9.k(mVar, System.currentTimeMillis(), th2, thread, cVar)));
            } catch (TimeoutException unused) {
                Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
            } catch (Exception e10) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e10);
            }
        }
    }
}
