package w;
public final class d {
    public final Object f48893a;
    public final String f48894b;

    public d(Object obj, String str) {
        this.f48893a = obj;
        this.f48894b = str;
    }

    public final String a() {
        return "[" + this.f48894b + ", " + g.i(this.f48893a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
