package te;

import android.os.Build;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    public static boolean b(int i10) {
        if ((i10 & 32768) != 0) {
            return true;
        }
        return false;
    }

    public static boolean c(int i10) {
        if (i10 != 15 && i10 != 255) {
            if (i10 != 32768) {
                if (i10 != 32783) {
                    if (i10 != 33023 && i10 != 0) {
                        return false;
                    }
                    return true;
                }
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 28 && i11 <= 29) {
                    return false;
                }
                return true;
            } else if (Build.VERSION.SDK_INT < 30) {
                return false;
            } else {
                return true;
            }
        }
        return true;
    }
}
