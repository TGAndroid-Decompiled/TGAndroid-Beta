package w;
public final class d {
    public final Object f49787a;
    public final String f49788b;

    public d(Object obj, String str) {
        this.f49787a = obj;
        this.f49788b = str;
    }

    public final String a() {
        return "[" + this.f49788b + ", " + g.i(this.f49787a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
