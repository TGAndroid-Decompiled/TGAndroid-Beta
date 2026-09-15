package w;
public final class d {
    public final Object f44463a;
    public final String f44464b;

    public d(Object obj, String str) {
        this.f44463a = obj;
        this.f44464b = str;
    }

    public final String a() {
        return "[" + this.f44464b + ", " + h.i(this.f44463a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
