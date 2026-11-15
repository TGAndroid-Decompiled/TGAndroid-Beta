package pb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f54943b = new Object();
    public static f f54944c;
    public final y f54945a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f54945a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f54943b) {
            try {
                if (f54944c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f54944c = new f(handlerThread.getLooper());
                }
                fVar = f54944c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        n.f54964a.execute(new l(1, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
