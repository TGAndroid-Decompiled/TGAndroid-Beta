package qb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f44275b = new Object();
    public static f f44276c;
    public final c0 f44277a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f44277a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f44275b) {
            try {
                if (f44276c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f44276c = new f(handlerThread.getLooper());
                }
                fVar = f44276c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f44293a.execute(new i9.s(25, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
