package zf;
public final class b {
    public static final b f54675a;
    public static final b f54676b;
    public static final b[] f54677c;

    static {
        ?? r02 = new Enum("STARS", 0);
        f54675a = r02;
        ?? r12 = new Enum("TON", 1);
        f54676b = r12;
        f54677c = new b[]{r02, r12};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f54677c.clone();
    }
}
