package t7;
public final class e {
    public final Object f43318a;
    public final Object f43319b;
    public final Object f43320c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43318a = obj;
        this.f43319b = obj2;
        this.f43320c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43318a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f43320c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43319b), " and ")));
    }
}
