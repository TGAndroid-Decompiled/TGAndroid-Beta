package w;
public final class d {
    public final Object f49864a;
    public final String f49865b;

    public d(Object obj, String str) {
        this.f49864a = obj;
        this.f49865b = str;
    }

    public final String a() {
        return "[" + this.f49865b + ", " + g.i(this.f49864a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
