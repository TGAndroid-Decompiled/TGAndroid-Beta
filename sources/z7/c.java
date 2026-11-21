package z7;
public final class c {
    public static final c f61545a;
    public static final c[] f61546b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f61545a = r02;
        f61546b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f61546b.clone();
    }
}
