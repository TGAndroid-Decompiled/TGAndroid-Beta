package rb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j9.u;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f45227b = new Object();
    public static f f45228c;
    public final a0 f45229a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f45229a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f45227b) {
            try {
                if (f45228c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f45228c = new f(handlerThread.getLooper());
                }
                fVar = f45228c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f45245a.execute(new u(26, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
