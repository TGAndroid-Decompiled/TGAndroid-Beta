package w;
public final class d {
    public final Object f47060a;
    public final String f47061b;

    public d(Object obj, String str) {
        this.f47060a = obj;
        this.f47061b = str;
    }

    public final String a() {
        return "[" + this.f47061b + ", " + g.i(this.f47060a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
