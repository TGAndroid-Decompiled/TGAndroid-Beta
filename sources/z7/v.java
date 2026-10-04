package z7;
public final class v {
    public static final v f52937a;
    public static final v[] f52938b;

    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f52937a = r02;
        f52938b = new v[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static v[] values() {
        return (v[]) f52938b.clone();
    }
}
