package t7;
public final class e {
    public final Object f48208a;
    public final Object f48209b;
    public final Object f48210c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f48208a = obj;
        this.f48209b = obj2;
        this.f48210c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f48208a;
        return new IllegalArgumentException(a1.g.r(String.valueOf(obj), "=", String.valueOf(this.f48210c), a1.g.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f48209b), " and ")));
    }
}
