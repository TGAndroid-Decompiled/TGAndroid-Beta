package x9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import vh.w3;
public final class r implements Thread.UncaughtExceptionHandler {
    public final w3 f53501a;
    public final ea.d f53502b;
    public final Thread.UncaughtExceptionHandler f53503c;
    public final u9.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public r(w3 w3Var, ea.d dVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, u9.a aVar) {
        this.f53501a = w3Var;
        this.f53502b = dVar;
        this.f53503c = uncaughtExceptionHandler;
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
