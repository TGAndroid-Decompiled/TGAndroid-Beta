package zi;
public final class o0 {
    public static final o0 f61666a;
    public static final o0 f61667b;
    public static final o0 f61668c;
    public static final o0[] d;

    static {
        ?? r02 = new Enum("HIGH", 0);
        f61666a = r02;
        ?? r12 = new Enum("MEDIUM", 1);
        f61667b = r12;
        ?? r32 = new Enum("LOW", 2);
        f61668c = r32;
        d = new o0[]{r02, r12, r32};
    }

    public static o0 valueOf(String str) {
        return (o0) Enum.valueOf(o0.class, str);
    }

    public static o0[] values() {
        return (o0[]) d.clone();
    }
}
