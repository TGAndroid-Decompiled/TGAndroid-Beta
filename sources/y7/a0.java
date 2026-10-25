package y7;
public final class a0 {
    public static final a0 f52068a;
    public static final a0[] f52069b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f52068a = r02;
        f52069b = new a0[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static a0[] values() {
        return (a0[]) f52069b.clone();
    }
}
