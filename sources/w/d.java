package w;
public final class d {
    public final Object f57577a;
    public final String f57578b;

    public d(Object obj, String str) {
        this.f57577a = obj;
        this.f57578b = str;
    }

    public final String a() {
        return "[" + this.f57578b + ", " + g.i(this.f57577a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
