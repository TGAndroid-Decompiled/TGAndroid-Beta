package u2;
public final class s0 {
    public static final s0 f47430a;
    public static final s0 f47431b;
    public static final s0 f47432c;
    public static final s0[] d;

    static {
        ?? r02 = new Enum("PASS_THROUGH", 0);
        f47430a = r02;
        ?? r12 = new Enum("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f47431b = r12;
        ?? r32 = new Enum("DISCARDING", 2);
        f47432c = r32;
        d = new s0[]{r02, r12, r32};
    }

    public static s0 valueOf(String str) {
        return (s0) Enum.valueOf(s0.class, str);
    }

    public static s0[] values() {
        return (s0[]) d.clone();
    }
}
