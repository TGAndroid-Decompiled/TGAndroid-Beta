package w;
public final class d {
    public final Object f44744a;
    public final String f44745b;

    public d(Object obj, String str) {
        this.f44744a = obj;
        this.f44745b = str;
    }

    public final String a() {
        return "[" + this.f44745b + ", " + g.i(this.f44744a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
