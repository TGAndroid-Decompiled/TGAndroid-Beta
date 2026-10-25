package ui;
public final class j {
    public static final j f49932a;
    public static final j f49933b;
    public static final j f49934c;
    public static final j[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f49932a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f49933b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f49934c = r32;
        d = new j[]{r02, r12, r32};
    }

    public static j valueOf(String str) {
        return (j) Enum.valueOf(j.class, str);
    }

    public static j[] values() {
        return (j[]) d.clone();
    }
}
