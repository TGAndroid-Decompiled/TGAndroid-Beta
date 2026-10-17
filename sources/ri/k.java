package ri;
public final class k {
    public static final k f45839a;
    public static final k f45840b;
    public static final k f45841c;
    public static final k[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f45839a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f45840b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f45841c = r32;
        d = new k[]{r02, r12, r32};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) d.clone();
    }
}
