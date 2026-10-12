package ri;
public final class j {
    public static final j f44733a;
    public static final j f44734b;
    public static final j[] f44735c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f44733a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f44734b = r12;
        f44735c = new j[]{r02, r12};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) f44735c.clone();
    }
}
