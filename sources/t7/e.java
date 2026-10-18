package t7;
public final class e {
    public final Object f46929a;
    public final Object f46930b;
    public final Object f46931c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46929a = obj;
        this.f46930b = obj2;
        this.f46931c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46929a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f46931c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46930b), " and ")));
    }
}
