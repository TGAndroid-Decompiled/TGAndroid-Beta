package qb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.c0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f44276b = new Object();
    public static f f44277c;
    public final c0 f44278a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f44278a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f44276b) {
            try {
                if (f44277c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f44277c = new f(handlerThread.getLooper());
                }
                fVar = f44277c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f44294a.execute(new i9.s(25, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
