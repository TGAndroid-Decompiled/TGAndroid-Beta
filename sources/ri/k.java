package ri;
public final class k {
    public static final k f45811a;
    public static final k f45812b;
    public static final k f45813c;
    public static final k[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f45811a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f45812b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f45813c = r32;
        d = new k[]{r02, r12, r32};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) d.clone();
    }
}
