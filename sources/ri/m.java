package ri;
public final class m {
    public static final m f45827a;
    public static final m f45828b;
    public static final m f45829c;
    public static final m d;
    public static final m e;
    public static final m f45830f;
    public static final m h;
    public static final m f45831n;
    public static final m f45832r;
    public static final m f45833s;
    public static final m[] v;

    static {
        ?? r02 = new Enum("IDLE", 0);
        f45827a = r02;
        ?? r12 = new Enum("STARTING", 1);
        f45828b = r12;
        ?? r32 = new Enum("RECORDING", 2);
        f45829c = r32;
        ?? r52 = new Enum("PAUSING", 3);
        d = r52;
        ?? r72 = new Enum("PREVIEWING", 4);
        e = r72;
        ?? r92 = new Enum("RESUMING", 5);
        f45830f = r92;
        ?? r11 = new Enum("FINISHING", 6);
        h = r11;
        ?? r13 = new Enum("COMPLETED", 7);
        f45831n = r13;
        ?? r15 = new Enum("ERROR", 8);
        f45832r = r15;
        ?? r22 = new Enum("RELEASED", 9);
        f45833s = r22;
        v = new m[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) v.clone();
    }
}
