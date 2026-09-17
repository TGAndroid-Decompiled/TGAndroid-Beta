package w;
public final class d {
    public final Object f47900a;
    public final String f47901b;

    public d(Object obj, String str) {
        this.f47900a = obj;
        this.f47901b = str;
    }

    public final String a() {
        return "[" + this.f47901b + ", " + h.i(this.f47900a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
