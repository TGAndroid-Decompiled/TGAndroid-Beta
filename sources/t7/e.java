package t7;
public final class e {
    public final Object f46881a;
    public final Object f46882b;
    public final Object f46883c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f46881a = obj;
        this.f46882b = obj2;
        this.f46883c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f46881a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f46883c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f46882b), " and ")));
    }
}
