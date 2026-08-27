package za;

import android.os.HandlerThread;
import android.os.Looper;
import c2.t0;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.Callable;

public final class f {

    public static final Object f50283b = new Object();

    public static f f50284c;

    public final t0 f50285a;

    public f(Looper looper) {
        t0 t0Var = new t0(looper);
        Looper.getMainLooper();
        this.f50285a = t0Var;
    }

    public static f a() {
        f fVar;
        synchronized (f50283b) {
            try {
                if (f50284c == null) {
                    HandlerThread handlerThread = new HandlerThread("MLHandler", 9);
                    handlerThread.start();
                    f50284c = new f(handlerThread.getLooper());
                }
                fVar = f50284c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return fVar;
    }

    public static Task b(Callable callable) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        m.f50301a.execute(new o0.m(11, callable, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
