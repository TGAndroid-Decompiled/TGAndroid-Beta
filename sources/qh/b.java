package qh;
public final class b {
    public static final b f43627a;
    public static final b f43628b;
    public static final b f43629c;
    public static final b d;
    public static final b[] e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f43627a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f43628b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f43629c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) e.clone();
    }
}
