package rh;
public final class b {
    public static final b f54443a;
    public static final b f54444b;
    public static final b f54445c;
    public static final b d;
    public static final b[] f54446e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f54443a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f54444b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f54445c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f54446e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54446e.clone();
    }
}
