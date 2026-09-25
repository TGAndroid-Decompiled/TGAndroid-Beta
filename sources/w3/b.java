package w3;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import w9.w;
import za.c0;
public final class b {
    public final Object f44767a;

    public b(Object obj) {
        this.f44767a = obj;
    }

    public void a(c0 c0Var) {
        ((l5.q) ((i5.f) ((pa.b) this.f44767a).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new za.k(this)).a(new i5.a(null, c0Var, i5.d.f10983a, null), new j2.e(19));
    }

    public void b(da.b bVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.f44767a;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w.a(mVar.e.l(new w9.k(mVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }
}
