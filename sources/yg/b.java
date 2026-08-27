package yg;

public final class b {

    public static final b f50141a;

    public static final b f50142b;

    public static final b f50143c;
    public static final b d;

    public static final b[] f50144e;

    static {
        b bVar = new b("STATE_FULLY_HIDDEN", 0);
        f50141a = bVar;
        b bVar2 = new b("STATE_ANIMATING_TO_FULLY_HIDDEN", 1);
        f50142b = bVar2;
        b bVar3 = new b("STATE_ANIMATING_TO_FULLY_VISIBLE", 2);
        f50143c = bVar3;
        b bVar4 = new b("STATE_FULLY_VISIBLE", 3);
        d = bVar4;
        f50144e = new b[]{bVar, bVar2, bVar3, bVar4};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f50144e.clone();
    }
}
