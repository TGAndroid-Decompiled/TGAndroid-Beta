package t7;
public final class e {
    public final Object f47325a;
    public final Object f47326b;
    public final Object f47327c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f47325a = obj;
        this.f47326b = obj2;
        this.f47327c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f47325a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f47327c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f47326b), " and ")));
    }
}
