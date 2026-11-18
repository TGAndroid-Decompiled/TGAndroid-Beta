package w;
public final class d {
    public final Object f59582a;
    public final String f59583b;

    public d(Object obj, String str) {
        this.f59582a = obj;
        this.f59583b = str;
    }

    public final String a() {
        return "[" + this.f59583b + ", " + g.i(this.f59582a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
