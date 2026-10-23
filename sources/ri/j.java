package ri;
public final class j {
    public static final j f45822a;
    public static final j f45823b;
    public static final j f45824c;
    public static final j[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f45822a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f45823b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f45824c = r32;
        d = new j[]{r02, r12, r32};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }
}
