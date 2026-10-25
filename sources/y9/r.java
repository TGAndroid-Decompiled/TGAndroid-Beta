package y9;

import aa.b0;
import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import li.h5;
public final class r implements Thread.UncaughtExceptionHandler {
    public final h5 f52472a;
    public final b0 f52473b;
    public final Thread.UncaughtExceptionHandler f52474c;
    public final v9.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public r(h5 h5Var, b0 b0Var, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, v9.a aVar) {
        this.f52472a = h5Var;
        this.f52473b = b0Var;
        this.f52474c = uncaughtExceptionHandler;
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
        throw new UnsupportedOperationException("Method not decompiled: y9.r.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
