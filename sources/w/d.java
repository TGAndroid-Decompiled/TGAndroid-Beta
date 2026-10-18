package w;
public final class d {
    public final Object f48492a;
    public final String f48493b;

    public d(Object obj, String str) {
        this.f48492a = obj;
        this.f48493b = str;
    }

    public final String a() {
        return "[" + this.f48493b + ", " + g.i(this.f48492a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
