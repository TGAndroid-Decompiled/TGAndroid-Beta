package ri;
public final class k {
    public static final k f45813a;
    public static final k f45814b;
    public static final k f45815c;
    public static final k[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f45813a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f45814b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f45815c = r32;
        d = new k[]{r02, r12, r32};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) d.clone();
    }
}
