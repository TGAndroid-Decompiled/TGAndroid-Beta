package w;
public final class d {
    public final Object f59590a;
    public final String f59591b;

    public d(Object obj, String str) {
        this.f59590a = obj;
        this.f59591b = str;
    }

    public final String a() {
        return "[" + this.f59591b + ", " + g.i(this.f59590a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
