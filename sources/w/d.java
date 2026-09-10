package w;
public final class d {
    public final Object f43422a;
    public final String f43423b;

    public d(Object obj, String str) {
        this.f43422a = obj;
        this.f43423b = str;
    }

    public final String a() {
        return "[" + this.f43423b + ", " + h.i(this.f43422a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
