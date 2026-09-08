package t7;
public final class e {
    public final Object f46467a;
    public final Object f46468b;
    public final Object f46469c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46467a = obj;
        this.f46468b = obj2;
        this.f46469c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46467a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f46469c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46468b), " and ")));
    }
}
