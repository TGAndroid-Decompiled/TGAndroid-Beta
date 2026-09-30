package t7;
public final class e {
    public final Object f43412a;
    public final Object f43413b;
    public final Object f43414c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43412a = obj;
        this.f43413b = obj2;
        this.f43414c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43412a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f43414c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43413b), " and ")));
    }
}
