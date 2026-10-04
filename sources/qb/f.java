package qb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f44909b = new Object();
    public static f f44910c;
    public final c0 f44911a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f44911a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f44909b) {
            try {
                if (f44910c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f44910c = new f(handlerThread.getLooper());
                }
                fVar = f44910c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f44927a.execute(new i9.s(25, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
