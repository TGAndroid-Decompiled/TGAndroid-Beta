package zf;
public final class b {
    public static final b f54667a;
    public static final b f54668b;
    public static final b[] f54669c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f54667a = r02;
        ?? r12 = new Enum("TON", 1);
        f54668b = r12;
        f54669c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54669c.clone();
    }
}
