package qi;
public final class i0 {
    public static final i0 f46770a;
    public static final i0 f46771b;
    public static final i0[] f46772c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f46770a = r02;
        ?? r12 = new Enum("BACK", 1);
        f46771b = r12;
        f46772c = new i0[]{r02, r12};
    }

    public static i0 valueOf(String str) {
        return (i0) Enum.valueOf(i0.class, str);
    }

    public static i0[] values() {
        return (i0[]) f46772c.clone();
    }
}
