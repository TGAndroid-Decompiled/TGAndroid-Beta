package w7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class z7 {
    public static long f48343a;
    public static Method f48344b;

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
            if (f48344b == null) {
                f48343a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f48344b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f48344b.invoke(null, Long.valueOf(f48343a))).booleanValue();
        } catch (Exception e7) {
            if (e7 instanceof InvocationTargetException) {
                Throwable cause = e7.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                throw new RuntimeException(cause);
            }
            Log.v("Trace", "Unable to call isTagEnabled via reflection", e7);
            return false;
        }
    }
}
