package w;
public final class d {
    public final Object f48453a;
    public final String f48454b;

    public d(Object obj, String str) {
        this.f48453a = obj;
        this.f48454b = str;
    }

    public final String a() {
        return "[" + this.f48454b + ", " + g.i(this.f48453a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
