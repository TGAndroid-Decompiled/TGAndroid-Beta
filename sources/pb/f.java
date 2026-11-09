package pb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import org.telegram.ui.hx;
public final class f {
    public static final Object f53539b = new Object();
    public static f f53540c;
    public final y f53541a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f53541a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f53539b) {
            try {
                if (f53540c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f53540c = new f(handlerThread.getLooper());
                }
                fVar = f53540c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f53557a.execute(new hx(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
