package z7;
public final class a0 {
    public static final a0 f59796a;
    public static final a0[] f59797b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f59796a = r02;
        f59797b = new a0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static a0[] values() {
        return (a0[]) f59797b.clone();
    }
}
