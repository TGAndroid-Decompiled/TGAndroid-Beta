package t7;
public final class e {
    public final Object f43349a;
    public final Object f43350b;
    public final Object f43351c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43349a = obj;
        this.f43350b = obj2;
        this.f43351c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43349a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f43351c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43350b), " and ")));
    }
}
