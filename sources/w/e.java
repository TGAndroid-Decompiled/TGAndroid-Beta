package w;
public final class e {
    public final Object f49310a;
    public final String f49311b;

    public e(Object obj, String str) {
        this.f49310a = obj;
        this.f49311b = str;
    }

    public final String a() {
        return "[" + this.f49311b + ", " + h.i(this.f49310a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
