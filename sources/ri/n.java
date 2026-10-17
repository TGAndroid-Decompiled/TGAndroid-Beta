package ri;
public final class n {
    public static final n f45845a;
    public static final n f45846b;
    public static final n f45847c;
    public static final n d;
    public static final n e;
    public static final n f45848f;
    public static final n h;
    public static final n f45849n;
    public static final n f45850r;
    public static final n f45851s;
    public static final n[] v;

    static {
        ?? r02 = new Enum("IDLE", 0);
        f45845a = r02;
        ?? r12 = new Enum("STARTING", 1);
        f45846b = r12;
        ?? r32 = new Enum("RECORDING", 2);
        f45847c = r32;
        ?? r52 = new Enum("PAUSING", 3);
        d = r52;
        ?? r72 = new Enum("PREVIEWING", 4);
        e = r72;
        ?? r92 = new Enum("RESUMING", 5);
        f45848f = r92;
        ?? r11 = new Enum("FINISHING", 6);
        h = r11;
        ?? r13 = new Enum("COMPLETED", 7);
        f45849n = r13;
        ?? r15 = new Enum("ERROR", 8);
        f45850r = r15;
        ?? r22 = new Enum("RELEASED", 9);
        f45851s = r22;
        v = new n[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) v.clone();
    }
}
