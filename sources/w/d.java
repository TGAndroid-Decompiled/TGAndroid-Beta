package w;
public final class d {
    public final Object f44781a;
    public final String f44782b;

    public d(Object obj, String str) {
        this.f44781a = obj;
        this.f44782b = str;
    }

    public final String a() {
        return "[" + this.f44782b + ", " + g.i(this.f44781a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
