package t7;
public final class e {
    public final Object f46440a;
    public final Object f46441b;
    public final Object f46442c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46440a = obj;
        this.f46441b = obj2;
        this.f46442c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46440a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f46442c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46441b), " and ")));
    }
}
