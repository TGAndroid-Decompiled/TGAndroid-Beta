package t7;
public final class e {
    public final Object f46886a;
    public final Object f46887b;
    public final Object f46888c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46886a = obj;
        this.f46887b = obj2;
        this.f46888c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46886a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f46888c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46887b), " and ")));
    }
}
