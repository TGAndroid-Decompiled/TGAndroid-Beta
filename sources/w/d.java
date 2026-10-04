package w;
public final class d {
    public final Object f48445a;
    public final String f48446b;

    public d(Object obj, String str) {
        this.f48445a = obj;
        this.f48446b = str;
    }

    public final String a() {
        return "[" + this.f48446b + ", " + g.i(this.f48445a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
