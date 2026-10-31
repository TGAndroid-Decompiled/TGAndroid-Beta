package t7;
public final class e {
    public final Object f48540a;
    public final Object f48541b;
    public final Object f48542c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48540a = obj;
        this.f48541b = obj2;
        this.f48542c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48540a;
        return new IllegalArgumentException(a1.g.o(String.valueOf(obj), "=", String.valueOf(this.f48542c), a1.g.v("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48541b), " and ")));
    }
}
