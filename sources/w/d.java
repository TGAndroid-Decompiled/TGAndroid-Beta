package w;
public final class d {
    public final Object f59710a;
    public final String f59711b;

    public d(Object obj, String str) {
        this.f59710a = obj;
        this.f59711b = str;
    }

    public final String a() {
        return "[" + this.f59711b + ", " + g.i(this.f59710a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
