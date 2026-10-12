package pi;
public final class l {
    public static final l f45790a;
    public static final l f45791b;
    public static final l[] f45792c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45790a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45791b = r12;
        f45792c = new l[]{r02, r12};
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) f45792c.clone();
    }
}
