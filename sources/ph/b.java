package ph;
public final class b {
    public static final b f45903a;
    public static final b f45904b;
    public static final b f45905c;
    public static final b d;
    public static final b[] f45906e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f45903a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f45904b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f45905c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f45906e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f45906e.clone();
    }
}
