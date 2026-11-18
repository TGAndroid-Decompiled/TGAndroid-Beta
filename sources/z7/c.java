package z7;
public final class c {
    public static final c f61504a;
    public static final c[] f61505b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f61504a = r02;
        f61505b = new c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static c[] values() {
        return (c[]) f61505b.clone();
    }
}
