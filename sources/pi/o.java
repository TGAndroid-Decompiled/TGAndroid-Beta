package pi;
public final class o {
    public static final o f45805a;
    public static final o f45806b;
    public static final o f45807c;
    public static final o[] d;

    static {
        ?? r02 = new Enum("REBUILT", 0);
        f45805a = r02;
        ?? r12 = new Enum("CANCELLED", 1);
        f45806b = r12;
        ?? r32 = new Enum("ERROR", 2);
        f45807c = r32;
        d = new o[]{r02, r12, r32};
    }

    public static o valueOf(String str) {
        return (o) Enum.valueOf(o.class, str);
    }

    public static o[] values() {
        return (o[]) d.clone();
    }
}
