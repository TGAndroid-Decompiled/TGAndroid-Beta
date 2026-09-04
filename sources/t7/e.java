package t7;
public final class e {
    public final Object f46439a;
    public final Object f46440b;
    public final Object f46441c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46439a = obj;
        this.f46440b = obj2;
        this.f46441c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46439a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f46441c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46440b), " and ")));
    }
}
