package t7;
public final class e {
    public final Object f46912a;
    public final Object f46913b;
    public final Object f46914c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46912a = obj;
        this.f46913b = obj2;
        this.f46914c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46912a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f46914c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46913b), " and ")));
    }
}
