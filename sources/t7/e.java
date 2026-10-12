package t7;
public final class e {
    public final Object f45518a;
    public final Object f45519b;
    public final Object f45520c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f45518a = obj;
        this.f45519b = obj2;
        this.f45520c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f45518a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f45520c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f45519b), " and ")));
    }
}
