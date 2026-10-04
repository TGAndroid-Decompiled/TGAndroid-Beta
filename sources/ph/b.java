package ph;
public final class b {
    public static final b f44701a;
    public static final b f44702b;
    public static final b f44703c;
    public static final b d;
    public static final b[] f44704e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f44701a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f44702b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f44703c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f44704e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f44704e.clone();
    }
}
