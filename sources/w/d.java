package w;
public final class d {
    public final Object f44491a;
    public final String f44492b;

    public d(Object obj, String str) {
        this.f44491a = obj;
        this.f44492b = str;
    }

    public final String a() {
        return "[" + this.f44492b + ", " + h.i(this.f44491a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
