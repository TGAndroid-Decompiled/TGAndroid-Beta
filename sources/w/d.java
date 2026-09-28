package w;
public final class d {
    public final Object f44743a;
    public final String f44744b;

    public d(Object obj, String str) {
        this.f44743a = obj;
        this.f44744b = str;
    }

    public final String a() {
        return "[" + this.f44744b + ", " + g.i(this.f44743a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
