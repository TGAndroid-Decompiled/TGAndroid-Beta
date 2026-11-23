package pb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f55642b = new Object();
    public static f f55643c;
    public final y f55644a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f55644a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f55642b) {
            try {
                if (f55643c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f55643c = new f(handlerThread.getLooper());
                }
                fVar = f55643c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n.f55663a.execute(new l(1, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
