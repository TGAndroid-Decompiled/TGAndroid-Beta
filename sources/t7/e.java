package t7;
public final class e {
    public final Object f46879a;
    public final Object f46880b;
    public final Object f46881c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46879a = obj;
        this.f46880b = obj2;
        this.f46881c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46879a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f46881c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46880b), " and ")));
    }
}
