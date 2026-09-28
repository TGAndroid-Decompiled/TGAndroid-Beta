package t7;
public final class e {
    public final Object f43304a;
    public final Object f43305b;
    public final Object f43306c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43304a = obj;
        this.f43305b = obj2;
        this.f43306c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43304a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f43306c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43305b), " and ")));
    }
}
