package xe;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
public abstract class b {
    public static Object a(Class cls, InvocationHandler invocationHandler) {
        if (invocationHandler == null) {
            return null;
        }
        return cls.cast(Proxy.newProxyInstance(b.class.getClassLoader(), new Class[]{cls}, invocationHandler));
    }
}
