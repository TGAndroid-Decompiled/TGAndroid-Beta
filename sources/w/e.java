package w;
public final class e {
    public final Object f49311a;
    public final String f49312b;

    public e(Object obj, String str) {
        this.f49311a = obj;
        this.f49312b = str;
    }

    public final String a() {
        return "[" + this.f49312b + ", " + h.i(this.f49311a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
