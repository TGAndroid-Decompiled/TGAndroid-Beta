package w;
public final class d {
    public final Object f49608a;
    public final String f49609b;

    public d(Object obj, String str) {
        this.f49608a = obj;
        this.f49609b = str;
    }

    public final String a() {
        return "[" + this.f49609b + ", " + g.i(this.f49608a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
