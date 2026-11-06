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
    public static final Object f53433b = new Object();
    public static f f53434c;
    public final y f53435a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f53435a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f53433b) {
            try {
                if (f53434c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f53434c = new f(handlerThread.getLooper());
                }
                fVar = f53434c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f53451a.execute(new fx(callable, taskCompletionSource, false, 2));
        return taskCompletionSource.getTask();
    }
}
