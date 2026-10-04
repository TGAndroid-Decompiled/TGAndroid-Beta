package ph;
public final class b {
    public static final b f44700a;
    public static final b f44701b;
    public static final b f44702c;
    public static final b d;
    public static final b[] f44703e;

    static {
        ?? r02 = new Enum("STATE_FULLY_HIDDEN", 0);
        f44700a = r02;
        ?? r12 = new Enum("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f44701b = r12;
        ?? r32 = new Enum("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f44702c = r32;
        ?? r52 = new Enum("STATE_FULLY_VISIBLE", 3);
        d = r52;
        f44703e = new b[]{r02, r12, r32, r52};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f44703e.clone();
    }
}
