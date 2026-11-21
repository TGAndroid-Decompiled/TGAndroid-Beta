package w;
public final class d {
    public final Object f59621a;
    public final String f59622b;

    public d(Object obj, String str) {
        this.f59621a = obj;
        this.f59622b = str;
    }

    public final String a() {
        return "[" + this.f59622b + ", " + g.i(this.f59621a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
