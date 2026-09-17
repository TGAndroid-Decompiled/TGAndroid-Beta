package t7;
public final class e {
    public final Object f46468a;
    public final Object f46469b;
    public final Object f46470c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46468a = obj;
        this.f46469b = obj2;
        this.f46470c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46468a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f46470c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46469b), " and ")));
    }
}
