package x6;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
public abstract class f {
    public static final Method f58642a;
    public static final Method f58643b;
    public static final Method f58644c;
    public static final Method d;
    public static Boolean f58645e;

    static {
        Method method;
        Method method2;
        Method method3;
        Method method4;
        Class<?> cls = Integer.TYPE;
        Process.myUid();
        try {
            method = WorkSource.class.getMethod("add", cls);
        } catch (Exception unused) {
            method = null;
        }
        f58642a = method;
        try {
            method2 = WorkSource.class.getMethod("add", cls, String.class);
        } catch (Exception unused2) {
            method2 = null;
        }
        f58643b = method2;
        try {
            method3 = WorkSource.class.getMethod("size", null);
        } catch (Exception unused3) {
            method3 = null;
        }
        f58644c = method3;
        try {
            WorkSource.class.getMethod("get", cls);
        } catch (Exception unused4) {
        }
        try {
            WorkSource.class.getMethod("getName", cls);
        } catch (Exception unused5) {
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WorkSource.class.getMethod("createWorkChain", null);
            } catch (Exception e10) {
                Log.w("WorkSourceUtil", "Missing WorkChain API createWorkChain", e10);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                Class.forName("android.os.WorkSource$WorkChain").getMethod("addNode", cls, String.class);
            } catch (Exception e11) {
                Log.w("WorkSourceUtil", "Missing WorkChain class", e11);
            }
        }
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                method4 = WorkSource.class.getMethod("isEmpty", null);
                try {
                    method4.setAccessible(true);
                } catch (Exception unused6) {
                }
            } catch (Exception unused7) {
            }
            d = method4;
            f58645e = null;
        }
        method4 = null;
        d = method4;
        f58645e = null;
    }

    public static void a(WorkSource workSource, int i7, String str) {
        Method method = f58643b;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i7), str);
                return;
            } catch (Exception e10) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e10);
                return;
            }
        }
        Method method2 = f58642a;
        if (method2 != null) {
            try {
                method2.invoke(workSource, Integer.valueOf(i7));
            } catch (Exception e11) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e11);
            }
        }
    }

    public static synchronized boolean b(Context context) {
        synchronized (f.class) {
            Boolean bool = f58645e;
            if (bool != null) {
                return bool.booleanValue();
            }
            boolean z9 = false;
            if (context == null) {
                return false;
            }
            if (f0.d.b(context, "android.permission.UPDATE_DEVICE_STATS") == 0) {
                z9 = true;
            }
            f58645e = Boolean.valueOf(z9);
            return z9;
        }
    }
}
