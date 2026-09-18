package t7;
public final class e {
    public final Object f43044a;
    public final Object f43045b;
    public final Object f43046c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43044a = obj;
        this.f43045b = obj2;
        this.f43046c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43044a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f43046c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43045b), " and ")));
    }
}
