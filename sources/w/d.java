package w;
public final class d {
    public final Object f48467a;
    public final String f48468b;

    public d(Object obj, String str) {
        this.f48467a = obj;
        this.f48468b = str;
    }

    public final String a() {
        return "[" + this.f48468b + ", " + g.i(this.f48467a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
