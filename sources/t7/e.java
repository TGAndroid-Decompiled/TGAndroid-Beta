package t7;
public final class e {
    public final Object f43305a;
    public final Object f43306b;
    public final Object f43307c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43305a = obj;
        this.f43306b = obj2;
        this.f43307c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43305a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f43307c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43306b), " and ")));
    }
}
