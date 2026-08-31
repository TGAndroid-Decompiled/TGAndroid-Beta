package v2;
public final class d {
    public static final d f48850a;
    public static final d f48851b;
    public static final d f48852c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48850a = r02;
        ?? r12 = new Enum("VERY_LOW", 1);
        f48851b = r12;
        ?? r32 = new Enum("HIGHEST", 2);
        f48852c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
