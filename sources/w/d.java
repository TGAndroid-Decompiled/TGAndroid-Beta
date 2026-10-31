package w;
public final class d {
    public final Object f52319a;
    public final String f52320b;

    public d(Object obj, String str) {
        this.f52319a = obj;
        this.f52320b = str;
    }

    public final String a() {
        return "[" + this.f52320b + ", " + g.i(this.f52319a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
