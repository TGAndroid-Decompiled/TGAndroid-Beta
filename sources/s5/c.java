package s5;
public final class c {
    public static final c f47878a;
    public static final c f47879b;
    public static final c f47880c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f47878a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f47879b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f47880c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
