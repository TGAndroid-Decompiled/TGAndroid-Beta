package t7;
public final class e {
    public final Object f48551a;
    public final Object f48552b;
    public final Object f48553c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48551a = obj;
        this.f48552b = obj2;
        this.f48553c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48551a;
        return new IllegalArgumentException(a1.g.o(String.valueOf(obj), "=", String.valueOf(this.f48553c), a1.g.v("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48552b), " and ")));
    }
}
