package t7;
public final class e {
    public final Object f46890a;
    public final Object f46891b;
    public final Object f46892c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46890a = obj;
        this.f46891b = obj2;
        this.f46892c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46890a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f46892c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46891b), " and ")));
    }
}
