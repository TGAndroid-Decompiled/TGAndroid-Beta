package w;
public final class d {
    public final Object f57474a;
    public final String f57475b;

    public d(Object obj, String str) {
        this.f57474a = obj;
        this.f57475b = str;
    }

    public final String a() {
        return "[" + this.f57475b + ", " + g.i(this.f57474a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
