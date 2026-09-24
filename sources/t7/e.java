package t7;
public final class e {
    public final Object f43290a;
    public final Object f43291b;
    public final Object f43292c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43290a = obj;
        this.f43291b = obj2;
        this.f43292c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43290a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f43292c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43291b), " and ")));
    }
}
