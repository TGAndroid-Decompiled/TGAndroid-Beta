package t7;
public final class e {
    public final Object f48206a;
    public final Object f48207b;
    public final Object f48208c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48206a = obj;
        this.f48207b = obj2;
        this.f48208c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48206a;
        return new IllegalArgumentException(a1.g.r(String.valueOf(obj), "=", String.valueOf(this.f48208c), a1.g.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48207b), " and ")));
    }
}
