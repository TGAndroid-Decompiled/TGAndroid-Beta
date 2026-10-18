package ri;
public final class i {
    public static final i f45805a;
    public static final i f45806b;
    public static final i[] f45807c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45805a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45806b = r12;
        f45807c = new i[]{r02, r12};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f45807c.clone();
    }
}
