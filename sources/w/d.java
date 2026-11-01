package w;
public final class d {
    public final Object f52337a;
    public final String f52338b;

    public d(Object obj, String str) {
        this.f52337a = obj;
        this.f52338b = str;
    }

    public final String a() {
        return "[" + this.f52338b + ", " + g.i(this.f52337a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
