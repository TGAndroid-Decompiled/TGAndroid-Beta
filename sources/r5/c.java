package r5;
public final class c {
    public static final c f45062a;
    public static final c f45063b;
    public static final c f45064c;
    public static final c[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f45062a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f45063b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f45064c = r32;
        d = new c[]{r02, r12, r32};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) d.clone();
    }
}
