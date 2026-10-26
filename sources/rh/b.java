package rh;
public final class b {
    public static final b f47608a;
    public static final b f47609b;
    public static final b f47610c;
    public static final b d;
    public static final b[] e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f47608a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f47609b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f47610c = r32;
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
