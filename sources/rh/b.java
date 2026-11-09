package rh;
public final class b {
    public static final b f54548a;
    public static final b f54549b;
    public static final b f54550c;
    public static final b d;
    public static final b[] f54551e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f54548a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f54549b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f54550c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f54551e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54551e.clone();
    }
}
