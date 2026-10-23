package x9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class q implements Thread.UncaughtExceptionHandler {
    public final le.b f50174a;
    public final ea.b f50175b;
    public final Thread.UncaughtExceptionHandler f50176c;
    public final u9.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public q(le.b bVar, ea.b bVar2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, u9.a aVar) {
        this.f50174a = bVar;
        this.f50175b = bVar2;
        this.f50176c = uncaughtExceptionHandler;
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
        throw new UnsupportedOperationException("Method not decompiled: x9.q.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
