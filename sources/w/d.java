package w;
public final class d {
    public final Object f48452a;
    public final String f48453b;

    public d(Object obj, String str) {
        this.f48452a = obj;
        this.f48453b = str;
    }

    public final String a() {
        return "[" + this.f48453b + ", " + g.i(this.f48452a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
