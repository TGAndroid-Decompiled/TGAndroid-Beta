package sh;
public final class b {
    public static final b f54719a;
    public static final b f54720b;
    public static final b f54721c;
    public static final b d;
    public static final b[] f54722e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f54719a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f54720b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f54721c = r32;
        ?? r5 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r5;
        f54722e = new b[]{r02, r12, r32, r5};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54722e.clone();
    }
}
