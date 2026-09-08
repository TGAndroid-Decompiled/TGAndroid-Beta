package r5;
public final class c {
    public static final c f44946a;
    public static final c f44947b;
    public static final c f44948c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f44946a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f44947b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f44948c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
