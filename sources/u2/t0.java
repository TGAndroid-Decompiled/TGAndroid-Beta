package u2;
public final class t0 {
    public static final t0 f47884a;
    public static final t0 f47885b;
    public static final t0 f47886c;
    public static final t0[] d;

    static {
        ?? r02 = new Enum("PASS_THROUGH", 0);
        f47884a = r02;
        ?? r12 = new Enum("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f47885b = r12;
        ?? r32 = new Enum("DISCARDING", 2);
        f47886c = r32;
        d = new t0[]{r02, r12, r32};
    }

    public static t0 valueOf(String str) {
        return (t0) Enum.valueOf(t0.class, str);
    }

    public static t0[] values() {
        return (t0[]) d.clone();
    }
}
