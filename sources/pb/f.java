package pb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f55519b = new Object();
    public static f f55520c;
    public final y f55521a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f55521a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f55519b) {
            try {
                if (f55520c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f55520c = new f(handlerThread.getLooper());
                }
                fVar = f55520c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n.f55540a.execute(new l(1, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
