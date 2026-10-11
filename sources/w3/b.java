package w3;

import android.util.Log;
import java.util.concurrent.TimeoutException;
import org.telegram.ui.h71;
import w9.x;
public final class b implements h71 {
    public Object f49855a;

    public b(Object obj) {
        this.f49855a = obj;
    }

    public void a(da.c cVar, Thread thread, Throwable th2) {
        w9.m mVar = (w9.m) this.f49855a;
        synchronized (mVar) {
            String str = "Handling uncaught exception \"" + th2 + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            try {
                try {
                    x.a(mVar.f50335e.l(new w9.k(mVar, System.currentTimeMillis(), th2, thread, cVar)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e7) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e7);
            }
        }
    }
}
