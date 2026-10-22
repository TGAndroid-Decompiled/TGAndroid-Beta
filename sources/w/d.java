package w;
public final class d {
    public final Object f48455a;
    public final String f48456b;

    public d(Object obj, String str) {
        this.f48455a = obj;
        this.f48456b = str;
    }

    public final String a() {
        return "[" + this.f48456b + ", " + g.i(this.f48455a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
