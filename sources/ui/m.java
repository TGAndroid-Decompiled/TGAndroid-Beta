package ui;
public final class m {
    public static final m f49976a;
    public static final m f49977b;
    public static final m f49978c;
    public static final m d;
    public static final m e;
    public static final m f49979f;
    public static final m h;
    public static final m f49980n;
    public static final m f49981r;
    public static final m f49982s;
    public static final m[] v;

    static {
        ?? r02 = new Enum("IDLE", 0);
        f49976a = r02;
        ?? r12 = new Enum("STARTING", 1);
        f49977b = r12;
        ?? r32 = new Enum("RECORDING", 2);
        f49978c = r32;
        ?? r52 = new Enum("PAUSING", 3);
        d = r52;
        ?? r72 = new Enum("PREVIEWING", 4);
        e = r72;
        ?? r92 = new Enum("RESUMING", 5);
        f49979f = r92;
        ?? r11 = new Enum("FINISHING", 6);
        h = r11;
        ?? r13 = new Enum("COMPLETED", 7);
        f49980n = r13;
        ?? r15 = new Enum("ERROR", 8);
        f49981r = r15;
        ?? r22 = new Enum("RELEASED", 9);
        f49982s = r22;
        v = new m[]{r02, r12, r32, r52, r72, r92, r11, r13, r15, r22};
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) v.clone();
    }
}
