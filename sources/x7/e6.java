package x7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class e6 {
    public static long f58273a;
    public static Method f58274b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return y4.a.a();
        }
        try {
            if (f58274b == null) {
                f58273a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f58274b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f58274b.invoke(null, Long.valueOf(f58273a))).booleanValue();
        } catch (Exception e10) {
            if (e10 instanceof InvocationTargetException) {
                Throwable cause = e10.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e10);
            return false;
        }
    }
}
