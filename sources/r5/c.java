package r5;
public final class c {
    public static final c f44947a;
    public static final c f44948b;
    public static final c f44949c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f44947a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f44948b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f44949c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
