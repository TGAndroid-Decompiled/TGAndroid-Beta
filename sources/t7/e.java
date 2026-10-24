package t7;
public final class e {
    public final Object f47324a;
    public final Object f47325b;
    public final Object f47326c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f47324a = obj;
        this.f47325b = obj2;
        this.f47326c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f47324a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f47326c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f47325b), " and ")));
    }
}
