package w;
public final class d {
    public final Object f44716a;
    public final String f44717b;

    public d(Object obj, String str) {
        this.f44716a = obj;
        this.f44717b = str;
    }

    public final String a() {
        return "[" + this.f44717b + ", " + g.i(this.f44716a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
