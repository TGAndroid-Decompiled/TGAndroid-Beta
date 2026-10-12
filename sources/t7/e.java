package t7;
public final class e {
    public final Object f48439a;
    public final Object f48440b;
    public final Object f48441c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48439a = obj;
        this.f48440b = obj2;
        this.f48441c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48439a;
        return new IllegalArgumentException(a1.g.r(String.valueOf(obj), "=", String.valueOf(this.f48441c), a1.g.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48440b), " and ")));
    }
}
