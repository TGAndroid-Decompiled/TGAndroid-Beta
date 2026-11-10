package x2;
public final class q0 {
    public static final q0 f58458a;
    public static final q0 f58459b;
    public static final q0 f58460c;
    public static final q0[] d;

    static {
        ?? r02 = new Enum("PASS_THROUGH", 0);
        f58458a = r02;
        ?? r12 = new Enum("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f58459b = r12;
        ?? r32 = new Enum("DISCARDING", 2);
        f58460c = r32;
        d = new q0[]{r02, r12, r32};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) d.clone();
    }
}
