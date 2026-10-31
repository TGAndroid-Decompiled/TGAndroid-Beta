package vb;
public final class e extends h {
    public static final e f50756c;

    static {
        ?? exc = new Exception();
        f50756c = exc;
        exc.setStackTrace(h.f50761b);
    }

    public static e a() {
        if (h.f50760a) {
            return new Exception();
        }
        return f50756c;
    }
}
