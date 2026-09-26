package w;
public final class d {
    public final Object f44742a;
    public final String f44743b;

    public d(Object obj, String str) {
        this.f44742a = obj;
        this.f44743b = str;
    }

    public final String a() {
        return "[" + this.f44743b + ", " + g.i(this.f44742a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
