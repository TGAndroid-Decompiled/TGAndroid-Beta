package ph;
public final class b {
    public static final b f45927a;
    public static final b f45928b;
    public static final b f45929c;
    public static final b d;
    public static final b[] f45930e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f45927a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f45928b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f45929c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f45930e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f45930e.clone();
    }
}
