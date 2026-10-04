package w;
public final class d {
    public final Object f48444a;
    public final String f48445b;

    public d(Object obj, String str) {
        this.f48444a = obj;
        this.f48445b = str;
    }

    public final String a() {
        return "[" + this.f48445b + ", " + g.i(this.f48444a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
