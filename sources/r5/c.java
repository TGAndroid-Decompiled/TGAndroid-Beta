package r5;
public final class c {
    public static final c f47205a;
    public static final c f47206b;
    public static final c f47207c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f47205a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f47206b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f47207c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
