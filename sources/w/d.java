package w;
public final class d {
    public final Object f48460a;
    public final String f48461b;

    public d(Object obj, String str) {
        this.f48460a = obj;
        this.f48461b = str;
    }

    public final String a() {
        return "[" + this.f48461b + ", " + g.i(this.f48460a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
