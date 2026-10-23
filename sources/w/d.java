package w;
public final class d {
    public final Object f48894a;
    public final String f48895b;

    public d(Object obj, String str) {
        this.f48894a = obj;
        this.f48895b = str;
    }

    public final String a() {
        return "[" + this.f48895b + ", " + g.i(this.f48894a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
