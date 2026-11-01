package vb;
public final class e extends h {
    public static final e f50770c;

    static {
        ?? exc = new Exception();
        f50770c = exc;
        exc.setStackTrace(h.f50775b);
    }

    public static e a() {
        if (h.f50774a) {
            return new Exception();
        }
        return f50770c;
    }
}
