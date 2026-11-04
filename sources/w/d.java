package w;
public final class d {
    public final Object f57006a;
    public final String f57007b;

    public d(Object obj, String str) {
        this.f57006a = obj;
        this.f57007b = str;
    }

    public final String a() {
        return "[" + this.f57007b + ", " + g.i(this.f57006a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
