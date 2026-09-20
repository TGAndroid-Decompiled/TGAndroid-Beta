package w;
public final class d {
    public final Object f44760a;
    public final String f44761b;

    public d(Object obj, String str) {
        this.f44760a = obj;
        this.f44761b = str;
    }

    public final String a() {
        return "[" + this.f44761b + ", " + g.i(this.f44760a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
