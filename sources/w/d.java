package w;
public final class d {
    public final Object f50637a;
    public final String f50638b;

    public d(Object obj, String str) {
        this.f50637a = obj;
        this.f50638b = str;
    }

    public final String a() {
        return "[" + this.f50638b + ", " + g.i(this.f50637a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
