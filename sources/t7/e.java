package t7;
public final class e {
    public final Object f48332a;
    public final Object f48333b;
    public final Object f48334c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48332a = obj;
        this.f48333b = obj2;
        this.f48334c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48332a;
        return new IllegalArgumentException(a1.g.r(String.valueOf(obj), "=", String.valueOf(this.f48334c), a1.g.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48333b), " and ")));
    }
}
