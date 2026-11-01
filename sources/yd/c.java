package yd;

import java.lang.reflect.Method;
import java.util.concurrent.ScheduledThreadPoolExecutor;
public abstract class c {
    public static final Method f54417a;

    static {
        Method method;
        try {
            method = ScheduledThreadPoolExecutor.class.getMethod("setRemoveOnCancelPolicy", Boolean.TYPE);
        } catch (Throwable unused) {
            method = null;
        }
        f54417a = method;
    }
}
