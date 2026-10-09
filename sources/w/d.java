package w;
public final class d {
    public final Object f49741a;
    public final String f49742b;

    public d(Object obj, String str) {
        this.f49741a = obj;
        this.f49742b = str;
    }

    public final String a() {
        return "[" + this.f49742b + ", " + g.i(this.f49741a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
