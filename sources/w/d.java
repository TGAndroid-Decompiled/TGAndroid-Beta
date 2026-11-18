package w;
public final class d {
    public final Object f59583a;
    public final String f59584b;

    public d(Object obj, String str) {
        this.f59583a = obj;
        this.f59584b = str;
    }

    public final String a() {
        return "[" + this.f59584b + ", " + g.i(this.f59583a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
