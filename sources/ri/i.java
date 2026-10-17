package ri;
public final class i {
    public static final i f45833a;
    public static final i f45834b;
    public static final i[] f45835c;

    static {
        ?? r02 = new Enum("DISABLED", 0);
        f45833a = r02;
        ?? r12 = new Enum("RNNOISE", 1);
        f45834b = r12;
        f45835c = new i[]{r02, r12};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f45835c.clone();
    }
}
