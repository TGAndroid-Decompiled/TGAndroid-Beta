package w7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class a0 {
    public static long f50804a;
    public static Method f50805b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return x4.a.a();
        }
        try {
            if (f50805b == null) {
                f50804a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f50805b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f50805b.invoke(null, Long.valueOf(f50804a))).booleanValue();
        } catch (Exception e) {
            if (e instanceof InvocationTargetException) {
                Throwable cause = e.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e);
            return false;
        }
    }
}
