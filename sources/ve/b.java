package ve;

import android.os.Build;
import android.widget.EdgeEffect;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import u0.c;
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static float b(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static float c(EdgeEffect edgeEffect, float f7, float f10) {
        if (Build.VERSION.SDK_INT >= 31) {
            return c.c(edgeEffect, f7, f10);
        }
        u0.b.a(edgeEffect, f7, f10);
        return f7;
    }
}
