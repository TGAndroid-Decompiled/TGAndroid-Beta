package w7;
public final class c {
    public static final c f48626a;
    public static final c[] f48627b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f48626a = r02;
        f48627b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f48627b.clone();
    }
}
