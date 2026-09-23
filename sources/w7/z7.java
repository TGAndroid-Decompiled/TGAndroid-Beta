package w7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class z7 {
    public static long f44833a;
    public static Method f44834b;

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
            if (f44834b == null) {
                f44833a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f44834b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f44834b.invoke(null, Long.valueOf(f44833a))).booleanValue();
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
