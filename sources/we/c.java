package we;
public final class c {
    public static final c f45043a;
    public static final c f45044b;
    public static final c f45045c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f45043a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f45044b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f45045c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
