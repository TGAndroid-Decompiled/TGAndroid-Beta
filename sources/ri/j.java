package ri;
public final class j {
    public static final j f45818a;
    public static final j f45819b;
    public static final j f45820c;
    public static final j[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f45818a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f45819b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f45820c = r32;
        d = new j[]{r02, r12, r32};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }
}
