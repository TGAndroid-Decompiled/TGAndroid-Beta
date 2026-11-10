package pb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.y;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import org.telegram.ui.ix;
public final class f {
    public static final Object f53538b = new Object();
    public static f f53539c;
    public final y f53540a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f53540a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f53538b) {
            try {
                if (f53539c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f53539c = new f(handlerThread.getLooper());
                }
                fVar = f53539c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f53556a.execute(new ix(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
