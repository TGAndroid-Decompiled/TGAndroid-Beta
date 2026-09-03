package w;
public final class d {
    public final Object f46428a;
    public final String f46429b;

    public d(Object obj, String str) {
        this.f46428a = obj;
        this.f46429b = str;
    }

    public final String a() {
        return "[" + this.f46429b + ", " + g.i(this.f46428a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
