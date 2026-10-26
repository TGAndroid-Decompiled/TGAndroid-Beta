package u7;
public final class e {
    public final Object f49598a;
    public final Object f49599b;
    public final Object f49600c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f49598a = obj;
        this.f49599b = obj2;
        this.f49600c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f49598a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f49600c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f49599b), " and ")));
    }
}
