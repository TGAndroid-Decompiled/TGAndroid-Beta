package w9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class q implements Thread.UncaughtExceptionHandler {
    public final w3.b f50281a;
    public final da.c f50282b;
    public final Thread.UncaughtExceptionHandler f50283c;
    public final t9.a d;
    public final AtomicBoolean f50284e = new AtomicBoolean(false);

    public q(w3.b bVar, da.c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, t9.a aVar) {
        this.f50281a = bVar;
        this.f50282b = cVar;
        this.f50283c = uncaughtExceptionHandler;
        this.d = aVar;
    }

    public final boolean a(Thread thread, Throwable th2) {
        if (thread == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null thread", null);
            return false;
        } else if (th2 == null) {
            Log.e("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; null throwable", null);
            return false;
        } else if (this.d.b()) {
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", "Crashlytics will not record uncaught exception; native crash exists for session.", null);
            }
            return false;
        } else {
            return true;
        }
    }

    @Override
    public final void uncaughtException(java.lang.Thread r10, java.lang.Throwable r11) {
        throw new UnsupportedOperationException("Method not decompiled: w9.q.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
