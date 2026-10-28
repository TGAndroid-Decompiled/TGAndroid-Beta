package s5;
public final class c {
    public static final c f47916a;
    public static final c f47917b;
    public static final c f47918c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f47916a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f47917b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f47918c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
