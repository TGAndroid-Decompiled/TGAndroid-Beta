package t7;
public final class e {
    public final Object f43274a;
    public final Object f43275b;
    public final Object f43276c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43274a = obj;
        this.f43275b = obj2;
        this.f43276c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43274a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f43276c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43275b), " and ")));
    }
}
