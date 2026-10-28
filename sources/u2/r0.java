package u2;
public final class r0 {
    public static final r0 f49447a;
    public static final r0 f49448b;
    public static final r0 f49449c;
    public static final r0[] d;

    static {
        ?? r02 = new Enum("PASS_THROUGH", 0);
        f49447a = r02;
        ?? r12 = new Enum("DISCARD_AFTER_NEXT_SAMPLE_METADATA", 1);
        f49448b = r12;
        ?? r32 = new Enum("DISCARDING", 2);
        f49449c = r32;
        d = new r0[]{r02, r12, r32};
    }

    public static r0 valueOf(String str) {
        return (r0) Enum.valueOf(r0.class, str);
    }

    public static r0[] values() {
        return (r0[]) d.clone();
    }
}
