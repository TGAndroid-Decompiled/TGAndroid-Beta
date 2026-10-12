package pi;
public final class n {
    public static final n f45797a;
    public static final n f45798b;
    public static final n f45799c;
    public static final n[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f45797a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f45798b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f45799c = r32;
        d = new n[]{r02, r12, r32};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) d.clone();
    }
}
