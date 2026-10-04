package t7;
public final class e {
    public final Object f46897a;
    public final Object f46898b;
    public final Object f46899c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46897a = obj;
        this.f46898b = obj2;
        this.f46899c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46897a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f46899c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46898b), " and ")));
    }
}
