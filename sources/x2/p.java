package x2;
public final class p {
    public static final p f50042a;
    public static final p[] f50043b;
    p EF0;

    static {
        Enum r02 = new Enum("UNKNOWN", 0);
        ?? r12 = new Enum("ANDROID_FIREBASE", 1);
        f50042a = r12;
        f50043b = new p[]{r02, r12};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f50043b.clone();
    }
}
