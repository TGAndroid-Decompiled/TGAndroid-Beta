package ri;
public final class j {
    public static final j f46242a;
    public static final j f46243b;
    public static final j f46244c;
    public static final j[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f46242a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f46243b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f46244c = r32;
        d = new j[]{r02, r12, r32};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }
}
