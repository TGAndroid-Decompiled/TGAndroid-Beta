package w;
public final class d {
    public final Object f44745a;
    public final String f44746b;

    public d(Object obj, String str) {
        this.f44745a = obj;
        this.f44746b = str;
    }

    public final String a() {
        return "[" + this.f44746b + ", " + g.i(this.f44745a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
