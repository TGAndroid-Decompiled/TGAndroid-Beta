package w7;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
public abstract class d8 {
    public static long f49067a;
    public static Method f49068b;

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
            if (f49068b == null) {
                f49067a = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f49068b = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f49068b.invoke(null, Long.valueOf(f49067a))).booleanValue();
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
