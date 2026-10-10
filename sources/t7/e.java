package t7;
public final class e {
    public final Object f48252a;
    public final Object f48253b;
    public final Object f48254c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48252a = obj;
        this.f48253b = obj2;
        this.f48254c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48252a;
        return new IllegalArgumentException(a1.g.r(String.valueOf(obj), "=", String.valueOf(this.f48254c), a1.g.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48253b), " and ")));
    }
}
