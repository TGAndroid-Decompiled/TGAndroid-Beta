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
    public static final Object f53435b = new Object();
    public static f f53436c;
    public final y f53437a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f53437a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f53435b) {
            try {
                if (f53436c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f53436c = new f(handlerThread.getLooper());
                }
                fVar = f53436c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f53453a.execute(new fx(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
