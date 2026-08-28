package uc;

import java.lang.reflect.Method;
import kotlin.jvm.internal.i;
public abstract class a {
    public static final Method f48189a;

    static {
        Method method;
        Method[] methods = Throwable.class.getMethods();
        i.b(methods);
        int length = methods.length;
        int i9 = 0;
        while (true) {
            method = null;
            if (i9 >= length) {
                break;
            }
            Method method2 = methods[i9];
            if (i.a(method2.getName(), "addSuppressed")) {
                Class<?>[] parameterTypes = method2.getParameterTypes();
                i.d(parameterTypes, "getParameterTypes(...)");
                if (parameterTypes.length == 1) {
                    method = parameterTypes[0];
                }
                if (i.a(method, Throwable.class)) {
                    method = method2;
                    break;
                }
            }
            i9++;
        }
        f48189a = method;
        int length2 = methods.length;
        for (int i10 = 0; i10 < length2 && !i.a(methods[i10].getName(), "getSuppressed"); i10++) {
        }
    }
}
