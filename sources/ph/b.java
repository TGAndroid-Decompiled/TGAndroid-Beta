package ph;
public final class b {
    public static final b f45857a;
    public static final b f45858b;
    public static final b f45859c;
    public static final b d;
    public static final b[] f45860e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f45857a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f45858b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f45859c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f45860e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f45860e.clone();
    }
}
