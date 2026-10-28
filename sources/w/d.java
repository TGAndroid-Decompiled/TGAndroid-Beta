package w;
public final class d {
    public final Object f50698a;
    public final String f50699b;

    public d(Object obj, String str) {
        this.f50698a = obj;
        this.f50699b = str;
    }

    public final String a() {
        return "[" + this.f50699b + ", " + g.i(this.f50698a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
