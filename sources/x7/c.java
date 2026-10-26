package x7;
public final class c {
    public static final c f51427a;
    public static final c[] f51428b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f51427a = r02;
        f51428b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f51428b.clone();
    }
}
