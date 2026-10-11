package t7;
public final class e {
    public final Object f48298a;
    public final Object f48299b;
    public final Object f48300c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48298a = obj;
        this.f48299b = obj2;
        this.f48300c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48298a;
        return new IllegalArgumentException(a1.g.r(String.valueOf(obj), "=", String.valueOf(this.f48300c), a1.g.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48299b), " and ")));
    }
}
