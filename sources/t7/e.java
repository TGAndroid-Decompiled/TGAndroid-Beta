package t7;
public final class e {
    public final Object f42968a;
    public final Object f42969b;
    public final Object f42970c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f42968a = obj;
        this.f42969b = obj2;
        this.f42970c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f42968a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f42970c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f42969b), " and ")));
    }
}
