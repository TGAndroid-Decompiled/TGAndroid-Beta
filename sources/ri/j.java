package ri;
public final class j {
    public static final j f45821a;
    public static final j f45822b;
    public static final j f45823c;
    public static final j[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f45821a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f45822b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f45823c = r32;
        d = new j[]{r02, r12, r32};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }
}
