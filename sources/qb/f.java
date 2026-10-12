package qb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f46018b = new Object();
    public static f f46019c;
    public final a0 f46020a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f46020a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f46018b) {
            try {
                if (f46019c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f46019c = new f(handlerThread.getLooper());
                }
                fVar = f46019c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f46036a.execute(new i9.s(26, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
