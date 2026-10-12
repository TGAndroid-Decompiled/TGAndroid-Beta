package pi;
public final class q {
    public static final q f45803a;
    public static final q f45804b;
    public static final q f45805c;
    public static final q d;
    public static final q f45806e;
    public static final q f45807f;
    public static final q h;
    public static final q f45808n;
    public static final q f45809r;
    public static final q f45810s;
    public static final q[] v;

    static {
        ?? r02 = new Enum("IDLE", 0);
        f45803a = r02;
        ?? r12 = new Enum("STARTING", 1);
        f45804b = r12;
        ?? r32 = new Enum("RECORDING", 2);
        f45805c = r32;
        ?? r52 = new Enum("PAUSING", 3);
        d = r52;
        ?? r72 = new Enum("PREVIEWING", 4);
        f45806e = r72;
        ?? r92 = new Enum("RESUMING", 5);
        f45807f = r92;
        ?? r11 = new Enum("FINISHING", 6);
        h = r11;
        ?? r13 = new Enum("COMPLETED", 7);
        f45808n = r13;
        ?? r15 = new Enum("ERROR", 8);
        f45809r = r15;
        ?? r22 = new Enum("RELEASED", 9);
        f45810s = r22;
        v = new q[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22};
    }

    public static q valueOf(String str) {
        return (q) Enum.valueOf(q.class, str);
    }

    public static q[] values() {
        return (q[]) v.clone();
    }
}
