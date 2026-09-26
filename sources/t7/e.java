package t7;
public final class e {
    public final Object f43303a;
    public final Object f43304b;
    public final Object f43305c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43303a = obj;
        this.f43304b = obj2;
        this.f43305c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43303a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f43305c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43304b), " and ")));
    }
}
