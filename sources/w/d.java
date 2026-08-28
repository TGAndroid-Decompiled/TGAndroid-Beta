package w;
public final class d {
    public final Object f48417a;
    public final String f48418b;

    public d(Object obj, String str) {
        this.f48417a = obj;
        this.f48418b = str;
    }

    public final String a() {
        return "[" + this.f48418b + ", " + g.i(this.f48417a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
