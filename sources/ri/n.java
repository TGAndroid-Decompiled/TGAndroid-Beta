package ri;
public final class n {
    public static final n f45865a;
    public static final n f45866b;
    public static final n f45867c;
    public static final n d;
    public static final n e;
    public static final n f45868f;
    public static final n h;
    public static final n f45869n;
    public static final n f45870r;
    public static final n f45871s;
    public static final n[] v;

    static {
        ?? r02 = new Enum("IDLE", 0);
        f45865a = r02;
        ?? r12 = new Enum("STARTING", 1);
        f45866b = r12;
        ?? r32 = new Enum("RECORDING", 2);
        f45867c = r32;
        ?? r52 = new Enum("PAUSING", 3);
        d = r52;
        ?? r72 = new Enum("PREVIEWING", 4);
        e = r72;
        ?? r92 = new Enum("RESUMING", 5);
        f45868f = r92;
        ?? r11 = new Enum("FINISHING", 6);
        h = r11;
        ?? r13 = new Enum("COMPLETED", 7);
        f45869n = r13;
        ?? r15 = new Enum("ERROR", 8);
        f45870r = r15;
        ?? r22 = new Enum("RELEASED", 9);
        f45871s = r22;
        v = new n[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22};
    }

    public static n valueOf(String str) {
        return (n) Enum.valueOf(n.class, str);
    }

    public static n[] values() {
        return (n[]) v.clone();
    }
}
