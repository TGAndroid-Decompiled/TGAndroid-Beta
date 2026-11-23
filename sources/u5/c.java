package u5;
public final class c {
    public static final c f58433a;
    public static final c f58434b;
    public static final c f58435c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f58433a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f58434b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f58435c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
