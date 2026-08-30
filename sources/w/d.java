package w;
public final class d {
    public final Object f46346a;
    public final String f46347b;

    public d(Object obj, String str) {
        this.f46346a = obj;
        this.f46347b = str;
    }

    public final String a() {
        return "[" + this.f46347b + ", " + g.i(this.f46346a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
