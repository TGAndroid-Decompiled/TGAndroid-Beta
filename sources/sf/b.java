package sf;
public final class b {
    public static final b f48267a;
    public static final b f48268b;
    public static final b[] f48269c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f48267a = r02;
        ?? r12 = new Enum("TON", 1);
        f48268b = r12;
        f48269c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f48269c.clone();
    }
}
