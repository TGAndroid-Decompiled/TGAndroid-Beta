package w9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r implements Thread.UncaughtExceptionHandler {
    public final n2.c f49000a;
    public final da.b f49001b;
    public final Thread.UncaughtExceptionHandler f49002c;
    public final t9.a d;
    public final AtomicBoolean f49003e = new AtomicBoolean(false);

    public r(n2.c cVar, da.b bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, t9.a aVar) {
        this.f49000a = cVar;
        this.f49001b = bVar;
        this.f49002c = uncaughtExceptionHandler;
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
