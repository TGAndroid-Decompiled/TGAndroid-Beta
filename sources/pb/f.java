package pb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import org.telegram.ui.fx;
public final class f {
    public static final Object f53409b = new Object();
    public static f f53410c;
    public final y f53411a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f53411a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f53409b) {
            try {
                if (f53410c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f53410c = new f(handlerThread.getLooper());
                }
                fVar = f53410c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f53427a.execute(new fx(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
