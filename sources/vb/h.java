package vb;
public abstract class h extends Exception {
    public static final boolean f50760a;
    public static final StackTraceElement[] f50761b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f50760a = z10;
        f50761b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
