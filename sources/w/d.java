package w;
public final class d {
    public final Object f44851a;
    public final String f44852b;

    public d(Object obj, String str) {
        this.f44851a = obj;
        this.f44852b = str;
    }

    public final String a() {
        return "[" + this.f44852b + ", " + g.i(this.f44851a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
