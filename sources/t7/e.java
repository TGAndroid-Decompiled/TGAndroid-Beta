package t7;
public final class e {
    public final Object f46889a;
    public final Object f46890b;
    public final Object f46891c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46889a = obj;
        this.f46890b = obj2;
        this.f46891c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46889a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f46891c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46890b), " and ")));
    }
}
