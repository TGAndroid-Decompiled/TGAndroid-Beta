package t7;
public final class e {
    public final Object f43013a;
    public final Object f43014b;
    public final Object f43015c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43013a = obj;
        this.f43014b = obj2;
        this.f43015c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43013a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f43015c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43014b), " and ")));
    }
}
