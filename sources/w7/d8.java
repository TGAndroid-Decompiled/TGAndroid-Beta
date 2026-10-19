package w7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class d8 {
    public static long f48621a;
    public static Method f48622b;

    public static void a(String str) {
        if (str.length() > 127) {
            str = str.substring(0, 127);
        }
        Trace.beginSection(str);
    }

    public static boolean b() {
        if (Build.VERSION.SDK_INT >= 29) {
            return w4.a.a();
        }
        try {
            if (f48622b == null) {
                f48621a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f48622b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f48622b.invoke(null, Long.valueOf(f48621a))).booleanValue();
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
