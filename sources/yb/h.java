package yb;
public abstract class h extends Exception {
    public static final boolean f59365a;
    public static final StackTraceElement[] f59366b;

    static {
        boolean z10;
        if (System.getProperty("surefire.test.class.path") != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        f59365a = z10;
        f59366b = new StackTraceElement[0];
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        return null;
    }
}
