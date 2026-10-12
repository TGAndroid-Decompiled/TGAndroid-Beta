package r5;
public final class c {
    public static final c f43927a;
    public static final c f43928b;
    public static final c f43929c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f43927a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f43928b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f43929c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
