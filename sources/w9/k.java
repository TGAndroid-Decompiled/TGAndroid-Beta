package w9;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import za.a0;
public final class k {
    public final Object f45248a;

    public k(Object obj) {
        this.f45248a = obj;
    }

    public void a(a0 a0Var) {
        ((l5.r) ((i5.f) ((pa.b) this.f45248a).get())).a("FIREBASE_APPQUALITY_SESSION", new i5.c("json"), new r5.d(this, 28)).a(new i5.a(null, a0Var, i5.d.f10997a, null), new j2.e(22));
    }

    public void b(da.b bVar, Thread thread, Throwable th2) {
        n nVar = (n) this.f45248a;
        synchronized (nVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    x.a(nVar.e.l(new l(nVar, System.currentTimeMillis(), th2, thread, bVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }
}
