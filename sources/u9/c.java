package u9;

public final class c {

    public static final c f48457a;

    public static final c[] f48458b;

    static {
        c cVar = new c("DEFAULT", 0);
        f48457a = cVar;
        f48458b = new c[]{cVar, new c("SIGNED", 1), new c("FIXED", 2)};
    }

    public static c valueOf(String str) {
        return (c) Enum.valueOf(c.class, str);
    }

    public static c[] values() {
        return (c[]) f48458b.clone();
    }
}
