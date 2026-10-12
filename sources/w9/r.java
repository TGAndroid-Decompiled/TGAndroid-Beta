package w9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r implements Thread.UncaughtExceptionHandler {
    public final k f50517a;
    public final da.c f50518b;
    public final Thread.UncaughtExceptionHandler f50519c;
    public final t9.a d;
    public final AtomicBoolean f50520e = new AtomicBoolean(false);

    public r(k kVar, da.c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, t9.a aVar) {
        this.f50517a = kVar;
        this.f50518b = cVar;
        this.f50519c = uncaughtExceptionHandler;
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
        throw new UnsupportedOperationException("Method not decompiled: w9.r.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
