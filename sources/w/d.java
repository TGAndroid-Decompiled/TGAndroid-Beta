package w;
public final class d {
    public final Object f48447a;
    public final String f48448b;

    public d(Object obj, String str) {
        this.f48447a = obj;
        this.f48448b = str;
    }

    public final String a() {
        return "[" + this.f48448b + ", " + g.i(this.f48447a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
