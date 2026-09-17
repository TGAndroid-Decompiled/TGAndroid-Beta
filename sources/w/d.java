package w;
public final class d {
    public final Object f44486a;
    public final String f44487b;

    public d(Object obj, String str) {
        this.f44486a = obj;
        this.f44487b = str;
    }

    public final String a() {
        return "[" + this.f44487b + ", " + h.i(this.f44486a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
