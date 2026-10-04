package w7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class b8 {
    public static long f48609a;
    public static Method f48610b;

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
            if (f48610b == null) {
                f48609a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f48610b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f48610b.invoke(null, Long.valueOf(f48609a))).booleanValue();
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
