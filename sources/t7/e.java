package t7;
public final class e {
    public final Object f48447a;
    public final Object f48448b;
    public final Object f48449c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48447a = obj;
        this.f48448b = obj2;
        this.f48449c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48447a;
        return new IllegalArgumentException(a1.g.r(String.valueOf(obj), "=", String.valueOf(this.f48449c), a1.g.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48448b), " and ")));
    }
}
