package r5;
public final class d {
    public static final d f46336a;
    public static final d f46337b;
    public static final d f46338c;
    public static final d[] d;

    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f46336a = r02;
        ?? r12 = new Enum("DEVICE_IDLE", 1);
        f46337b = r12;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f46338c = r32;
        d = new d[]{r02, r12, r32};
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) d.clone();
    }
}
