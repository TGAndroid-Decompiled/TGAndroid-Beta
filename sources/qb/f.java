package qb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f40613b = new Object();
    public static f f40614c;
    public final c0 f40615a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f40615a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f40613b) {
            try {
                if (f40614c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f40614c = new f(handlerThread.getLooper());
                }
                fVar = f40614c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f40631a.execute(new i9.s(25, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
