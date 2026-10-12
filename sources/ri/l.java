package ri;
public final class l {
    public static final l f44739a;
    public static final l f44740b;
    public static final l f44741c;
    public static final l[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f44739a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f44740b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f44741c = r32;
        d = new l[]{r02, r12, r32};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) d.clone();
    }
}
