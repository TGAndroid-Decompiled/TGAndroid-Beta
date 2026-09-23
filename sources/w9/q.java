package w9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import org.telegram.ui.Cells.ja;
public final class q implements Thread.UncaughtExceptionHandler {
    public final ja f44919a;
    public final da.b f44920b;
    public final Thread.UncaughtExceptionHandler f44921c;
    public final t9.a d;
    public final AtomicBoolean e = new AtomicBoolean(false);

    public q(ja jaVar, da.b bVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, t9.a aVar) {
        this.f44919a = jaVar;
        this.f44920b = bVar;
        this.f44921c = uncaughtExceptionHandler;
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
