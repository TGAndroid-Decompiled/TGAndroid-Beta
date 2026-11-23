package w;
public final class d {
    public final Object f59625a;
    public final String f59626b;

    public d(Object obj, String str) {
        this.f59625a = obj;
        this.f59626b = str;
    }

    public final String a() {
        return "[" + this.f59626b + ", " + g.i(this.f59625a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
