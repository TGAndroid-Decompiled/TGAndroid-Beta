package vb;
public abstract class h extends Exception {
    public static final boolean f50774a;
    public static final StackTraceElement[] f50775b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f50774a = z10;
        f50775b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
