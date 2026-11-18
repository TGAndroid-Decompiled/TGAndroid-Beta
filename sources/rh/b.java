package rh;
public final class b {
    public static final b f56593a;
    public static final b f56594b;
    public static final b f56595c;
    public static final b d;
    public static final b[] f56596e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f56593a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f56594b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f56595c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f56596e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f56596e.clone();
    }
}
