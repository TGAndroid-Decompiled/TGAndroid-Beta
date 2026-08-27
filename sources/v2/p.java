package v2;

public final class p {

    public static final p f48731a;

    public static final p[] f48732b;

    p EF0;

    static {
        p pVar = new p("UNKNOWN", 0);
        p pVar2 = new p("ANDROID_FIREBASE", 1);
        f48731a = pVar2;
        f48732b = new p[]{pVar, pVar2};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f48732b.clone();
    }
}
