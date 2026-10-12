package w;
public final class d {
    public final Object f49979a;
    public final String f49980b;

    public d(Object obj, String str) {
        this.f49979a = obj;
        this.f49980b = str;
    }

    public final String a() {
        return "[" + this.f49980b + ", " + g.i(this.f49979a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
