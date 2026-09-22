package t7;
public final class e {
    public final Object f43339a;
    public final Object f43340b;
    public final Object f43341c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43339a = obj;
        this.f43340b = obj2;
        this.f43341c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43339a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f43341c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43340b), " and ")));
    }
}
