package wi;
public final class n0 {
    public static final n0 f58018a;
    public static final n0 f58019b;
    public static final n0[] f58020c;

    static {
        ?? r02 = new Enum("FRONT", 0);
        f58018a = r02;
        ?? r12 = new Enum("BACK", 1);
        f58019b = r12;
        f58020c = new n0[]{r02, r12};
    }

    public static n0 valueOf(String str) {
        return (n0) Enum.valueOf(n0.class, str);
    }

    public static n0[] values() {
        return (n0[]) f58020c.clone();
    }
}
