package w;
public final class d {
    public final Object f49971a;
    public final String f49972b;

    public d(Object obj, String str) {
        this.f49971a = obj;
        this.f49972b = str;
    }

    public final String a() {
        return "[" + this.f49972b + ", " + g.i(this.f49971a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
