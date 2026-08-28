package ya;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import c2.u0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;
import org.telegram.ui.fm;
public final class f {
    public static final Object f49688b = new Object();
    public static f f49689c;
    public final u0 f49690a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f49690a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f49688b) {
            try {
                if (f49689c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f49689c = new f(handlerThread.getLooper());
                }
                fVar = f49689c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f49706a.execute(new fm(callable, taskCompletionSource, false, 10));
        return taskCompletionSource.getTask();
    }
}
