package w;
public final class d {
    public final Object f49743a;
    public final String f49744b;

    public d(Object obj, String str) {
        this.f49743a = obj;
        this.f49744b = str;
    }

    public final String a() {
        return "[" + this.f49744b + ", " + g.i(this.f49743a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
