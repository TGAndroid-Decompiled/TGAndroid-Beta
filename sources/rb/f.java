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
    public static final Object f43851b = new Object();
    public static f f43852c;
    public final a0 f43853a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f43853a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f43851b) {
            try {
                if (f43852c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f43852c = new f(handlerThread.getLooper());
                }
                fVar = f43852c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f43869a.execute(new u(26, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
