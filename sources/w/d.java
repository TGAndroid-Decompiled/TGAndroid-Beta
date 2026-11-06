package w;
public final class d {
    public final Object f57449a;
    public final String f57450b;

    public d(Object obj, String str) {
        this.f57449a = obj;
        this.f57450b = str;
    }

    public final String a() {
        return "[" + this.f57450b + ", " + g.i(this.f57449a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
