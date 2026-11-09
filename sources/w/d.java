package w;
public final class d {
    public final Object f57578a;
    public final String f57579b;

    public d(Object obj, String str) {
        this.f57578a = obj;
        this.f57579b = str;
    }

    public final String a() {
        return "[" + this.f57579b + ", " + g.i(this.f57578a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
