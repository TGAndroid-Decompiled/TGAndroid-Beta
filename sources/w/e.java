package w;
public final class e {
    public final Object f44459a;
    public final String f44460b;

    public e(Object obj, String str) {
        this.f44459a = obj;
        this.f44460b = str;
    }

    public final String a() {
        return "[" + this.f44460b + ", " + h.i(this.f44459a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
