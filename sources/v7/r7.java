package v7;

import java.lang.reflect.Method;
public abstract class r7 {
    public static void a(Throwable th2, Throwable exception) {
        kotlin.jvm.internal.i.e(th2, "<this>");
        kotlin.jvm.internal.i.e(exception, "exception");
        if (th2 != exception) {
            Integer num = nd.a.f16745a;
            if (num != null && num.intValue() < 19) {
                Method method = md.a.f16219a;
                if (method != null) {
                    method.invoke(th2, exception);
                    return;
                }
                return;
            }
            th2.addSuppressed(exception);
        }
    }
}
