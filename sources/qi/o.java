package qi;
public final class o {
    public static final o f43421a;
    public static final o f43422b;
    public static final o f43423c;
    public static final o d;
    public static final o e;
    public static final o f43424f;
    public static final o h;
    public static final o f43425n;
    public static final o f43426r;
    public static final o f43427s;
    public static final o[] v;

    static {
        ?? r02 = new Enum("IDLE", 0);
        f43421a = r02;
        ?? r12 = new Enum("STARTING", 1);
        f43422b = r12;
        ?? r32 = new Enum("RECORDING", 2);
        f43423c = r32;
        ?? r52 = new Enum("PAUSING", 3);
        d = r52;
        ?? r72 = new Enum("PREVIEWING", 4);
        e = r72;
        ?? r92 = new Enum("RESUMING", 5);
        f43424f = r92;
        ?? r11 = new Enum("FINISHING", 6);
        h = r11;
        ?? r13 = new Enum("COMPLETED", 7);
        f43425n = r13;
        ?? r15 = new Enum("ERROR", 8);
        f43426r = r15;
        ?? r22 = new Enum("RELEASED", 9);
        f43427s = r22;
        v = new o[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) v.clone();
    }
}
