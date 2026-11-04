package xd;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import b8.ib;
import dd.f;
import kotlin.jvm.internal.j;
public abstract class d {
    private static volatile Choreographer choreographer;

    static {
        Object a10;
        try {
            a10 = new c(a(Looper.getMainLooper()), false);
        } catch (Throwable th2) {
            a10 = ib.a(th2);
        }
        if (a10 instanceof f) {
            a10 = null;
        }
        c cVar = (c) a10;
    }

    public static final Handler a(Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            Object invoke = Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
            j.c(invoke, "null cannot be cast to non-null type android.os.Handler");
            return (Handler) invoke;
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }
}
