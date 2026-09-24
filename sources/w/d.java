package w;
public final class d {
    public final Object f44729a;
    public final String f44730b;

    public d(Object obj, String str) {
        this.f44729a = obj;
        this.f44730b = str;
    }

    public final String a() {
        return "[" + this.f44730b + ", " + g.i(this.f44729a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
