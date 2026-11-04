package z9;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
public final class r implements Thread.UncaughtExceptionHandler {
    public final y3.b f60234a;
    public final ha.c f60235b;
    public final Thread.UncaughtExceptionHandler f60236c;
    public final w9.a d;
    public final AtomicBoolean f60237e = new AtomicBoolean(false);

    public r(y3.b bVar, ha.c cVar, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, w9.a aVar) {
        this.f60234a = bVar;
        this.f60235b = cVar;
        this.f60236c = uncaughtExceptionHandler;
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
    public final void uncaughtException(Thread thread, Throwable th2) {
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f60236c;
        AtomicBoolean atomicBoolean = this.f60237e;
        atomicBoolean.set(true);
        try {
            try {
                if (a(thread, th2)) {
                    this.f60234a.a(this.f60235b, thread, th2);
                } else if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Uncaught exception will not be recorded by Crashlytics.", null);
                }
                if (uncaughtExceptionHandler != null) {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                    }
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                        Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                    }
                    System.exit(1);
                }
                atomicBoolean.set(false);
            } catch (Exception e10) {
                w9.c cVar = w9.c.f57426a;
                if (cVar.a(6)) {
                    Log.e("FirebaseCrashlytics", "An error occurred in the uncaught exception handler", e10);
                }
                if (uncaughtExceptionHandler != null) {
                    cVar.b("Completed exception processing. Invoking default exception handler.");
                    uncaughtExceptionHandler.uncaughtException(thread, th2);
                } else {
                    cVar.b("Completed exception processing, but no default exception handler.");
                    System.exit(1);
                }
                atomicBoolean.set(false);
            }
        } catch (Throwable th3) {
            if (uncaughtExceptionHandler != null) {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing. Invoking default exception handler.", null);
                }
                uncaughtExceptionHandler.uncaughtException(thread, th2);
            } else {
                if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                    Log.d("FirebaseCrashlytics", "Completed exception processing, but no default exception handler.", null);
                }
                System.exit(1);
            }
            atomicBoolean.set(false);
            throw th3;
        }
    }
}
