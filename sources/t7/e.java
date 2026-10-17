package t7;
public final class e {
    public final Object f46907a;
    public final Object f46908b;
    public final Object f46909c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46907a = obj;
        this.f46908b = obj2;
        this.f46909c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46907a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f46909c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46908b), " and ")));
    }
}
