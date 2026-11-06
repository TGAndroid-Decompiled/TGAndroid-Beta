package w;
public final class d {
    public final Object f57473a;
    public final String f57474b;

    public d(Object obj, String str) {
        this.f57473a = obj;
        this.f57474b = str;
    }

    public final String a() {
        return "[" + this.f57474b + ", " + g.i(this.f57473a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
