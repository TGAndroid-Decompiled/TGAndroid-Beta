package w;
public final class d {
    public final Object f57565a;
    public final String f57566b;

    public d(Object obj, String str) {
        this.f57565a = obj;
        this.f57566b = str;
    }

    public final String a() {
        return "[" + this.f57566b + ", " + g.i(this.f57565a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
