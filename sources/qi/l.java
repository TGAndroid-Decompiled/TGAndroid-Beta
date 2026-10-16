package qi;
public final class l {
    public static final l f43415a;
    public static final l f43416b;
    public static final l f43417c;
    public static final l[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f43415a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f43416b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f43417c = r32;
        d = new l[]{r02, r12, r32};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) d.clone();
    }
}
