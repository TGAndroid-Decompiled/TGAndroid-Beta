package w;
public final class d {
    public final Object f49830a;
    public final String f49831b;

    public d(Object obj, String str) {
        this.f49830a = obj;
        this.f49831b = str;
    }

    public final String a() {
        return "[" + this.f49831b + ", " + g.i(this.f49830a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
