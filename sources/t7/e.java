package t7;
public final class e {
    public final Object f46898a;
    public final Object f46899b;
    public final Object f46900c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46898a = obj;
        this.f46899b = obj2;
        this.f46900c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46898a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f46900c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46899b), " and ")));
    }
}
