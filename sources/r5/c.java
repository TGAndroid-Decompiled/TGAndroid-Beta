package r5;
public final class c {
    public static final c f42435a;
    public static final c f42436b;
    public static final c f42437c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f42435a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f42436b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f42437c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
