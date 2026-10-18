package ri;
public final class i {
    public static final i f45853a;
    public static final i f45854b;
    public static final i[] f45855c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45853a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45854b = r12;
        f45855c = new i[]{r02, r12};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f45855c.clone();
    }
}
