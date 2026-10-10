package xe;
public final class c {
    public static final c f51162a;
    public static final c f51163b;
    public static final c f51164c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("LEFT", 0);
        f51162a = r02;
        ?? r12 = new Enum("CENTER", 1);
        f51163b = r12;
        ?? r32 = new Enum("RIGHT", 2);
        f51164c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
