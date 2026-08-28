package xg;
public final class b {
    public static final b f49428a;
    public static final b f49429b;
    public static final b f49430c;
    public static final b d;
    public static final b[] f49431e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f49428a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f49429b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f49430c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f49431e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f49431e.clone();
    }
}
