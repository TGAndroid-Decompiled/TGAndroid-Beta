package rb;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.internal.cast.a0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import j9.u;
import java.util.concurrent.Callable;
public final class f {
    public static final Object f45604b = new Object();
    public static f f45605c;
    public final a0 f45606a;

    public f(Looper looper) {
        ?? handler = new Handler(looper);
        Looper.getMainLooper();
        this.f45606a = handler;
    }

    public static f a() {
        f fVar;
        synchronized (f45604b) {
            try {
                if (f45605c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f45605c = new f(handlerThread.getLooper());
                }
                fVar = f45605c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f45622a.execute(new u(26, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
