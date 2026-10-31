package u2;
public final class r0 {
    public static final r0 f49990a;
    public static final r0 f49991b;
    public static final r0 f49992c;
    public static final r0[] d;

    static {
        ?? r02 = new Enum("PASS_THROUGH", 0);
        f49990a = r02;
        ?? r12 = new Enum("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f49991b = r12;
        ?? r32 = new Enum("DISCARDING", 2);
        f49992c = r32;
        d = new r0[]{r02, r12, r32};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) d.clone();
    }
}
