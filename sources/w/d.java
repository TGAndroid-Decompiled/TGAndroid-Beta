package w;
public final class d {
    public final Object f48456a;
    public final String f48457b;

    public d(Object obj, String str) {
        this.f48456a = obj;
        this.f48457b = str;
    }

    public final String a() {
        return "[" + this.f48457b + ", " + g.i(this.f48456a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
