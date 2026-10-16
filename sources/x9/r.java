package x9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r implements Thread.UncaughtExceptionHandler {
    public final v1.b f48337a;
    public final ea.b f48338b;
    public final Thread.UncaughtExceptionHandler f48339c;
    public final u9.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public r(v1.b bVar, ea.b bVar2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, u9.a aVar) {
        this.f48337a = bVar;
        this.f48338b = bVar2;
        this.f48339c = uncaughtExceptionHandler;
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
        throw new UnsupportedOperationException("Method not decompiled: x9.r.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
