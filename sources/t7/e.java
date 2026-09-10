package t7;
public final class e {
    public final Object f42086a;
    public final Object f42087b;
    public final Object f42088c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f42086a = obj;
        this.f42087b = obj2;
        this.f42088c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f42086a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f42088c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f42087b), " and ")));
    }
}
