package xe;
public final class c {
    public static final c f51346a;
    public static final c f51347b;
    public static final c f51348c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f51346a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f51347b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f51348c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
