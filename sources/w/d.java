package w;
public final class d {
    public final Object f57566a;
    public final String f57567b;

    public d(Object obj, String str) {
        this.f57566a = obj;
        this.f57567b = str;
    }

    public final String a() {
        return "[" + this.f57567b + ", " + g.i(this.f57566a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
