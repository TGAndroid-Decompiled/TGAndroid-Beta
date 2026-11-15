package x2;
public final class q0 {
    public static final q0 f59636a;
    public static final q0 f59637b;
    public static final q0 f59638c;
    public static final q0[] d;

    static {
        ?? r02 = new Enum("PASS_THROUGH", 0);
        f59636a = r02;
        ?? r12 = new Enum("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f59637b = r12;
        ?? r32 = new Enum("DISCARDING", 2);
        f59638c = r32;
        d = new q0[]{r02, r12, r32};
    }

    public static q0 valueOf(String str) {
        return (q0) Enum.valueOf(q0.class, str);
    }

    public static q0[] values() {
        return (q0[]) d.clone();
    }
}
