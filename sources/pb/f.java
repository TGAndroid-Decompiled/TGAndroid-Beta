package pb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f55560b = new Object();
    public static f f55561c;
    public final y f55562a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f55562a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f55560b) {
            try {
                if (f55561c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f55561c = new f(handlerThread.getLooper());
                }
                fVar = f55561c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n.f55581a.execute(new l(1, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
