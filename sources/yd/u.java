package yd;
public abstract class u {
    public static final int f54420a = 0;

    static {
        Object a2;
        Object a10;
        Exception exc = new Exception();
        String simpleName = a.a.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        try {
            a2 = ed.a.class.getCanonicalName();
        } catch (Throwable th2) {
            a2 = l9.b.a(th2);
        }
        if (ad.g.a(a2) != null) {
            a2 = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        String str = (String) a2;
        try {
            a10 = u.class.getCanonicalName();
        } catch (Throwable th3) {
            a10 = l9.b.a(th3);
        }
        if (ad.g.a(a10) != null) {
            a10 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        String str2 = (String) a10;
    }
}
