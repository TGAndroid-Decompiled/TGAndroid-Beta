package sb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import k9.u;
public final class f {
    public static final Object f48046b = new Object();
    public static f f48047c;
    public final y f48048a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f48048a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f48046b) {
            try {
                if (f48047c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f48047c = new f(handlerThread.getLooper());
                }
                fVar = f48047c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f48064a.execute(new u(27, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
