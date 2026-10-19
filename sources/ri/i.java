package ri;
public final class i {
    public static final i f45807a;
    public static final i f45808b;
    public static final i[] f45809c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45807a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45808b = r12;
        f45809c = new i[]{r02, r12};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f45809c.clone();
    }
}
