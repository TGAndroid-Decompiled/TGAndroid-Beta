package pi;
public final class r {
    public static final r f45811a;
    public static final r f45812b;
    public static final r f45813c;
    public static final r d;
    public static final r f45814e;
    public static final r f45815f;
    public static final r h;
    public static final r f45816n;
    public static final r f45817r;
    public static final r f45818s;
    public static final r[] v;

    static {
        ?? r02 = new Enum("IDLE", 0);
        f45811a = r02;
        ?? r12 = new Enum("STARTING", 1);
        f45812b = r12;
        ?? r32 = new Enum("RECORDING", 2);
        f45813c = r32;
        ?? r52 = new Enum("PAUSING", 3);
        d = r52;
        ?? r72 = new Enum("PREVIEWING", 4);
        f45814e = r72;
        ?? r92 = new Enum("RESUMING", 5);
        f45815f = r92;
        ?? r11 = new Enum("FINISHING", 6);
        h = r11;
        ?? r13 = new Enum("COMPLETED", 7);
        f45816n = r13;
        ?? r15 = new Enum("ERROR", 8);
        f45817r = r15;
        ?? r22 = new Enum("RELEASED", 9);
        f45818s = r22;
        v = new r[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) v.clone();
    }
}
