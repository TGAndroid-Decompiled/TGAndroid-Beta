package w3;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.i71;
import w9.w;
public final class b implements i71 {
    public Object f49812a;

    public b(Object obj) {
        this.f49812a = obj;
    }

    public void a(da.c cVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.f49812a;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    w.a(mVar.f50292e.l(new w9.k(mVar, System.currentTimeMillis(), th2, thread, cVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e7);
            }
        }
    }
}
