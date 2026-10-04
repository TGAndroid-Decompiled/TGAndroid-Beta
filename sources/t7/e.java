package t7;
public final class e {
    public final Object f46905a;
    public final Object f46906b;
    public final Object f46907c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46905a = obj;
        this.f46906b = obj2;
        this.f46907c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46905a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f46907c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46906b), " and ")));
    }
}
