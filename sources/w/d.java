package w;
public final class d {
    public final Object f50640a;
    public final String f50641b;

    public d(Object obj, String str) {
        this.f50640a = obj;
        this.f50641b = str;
    }

    public final String a() {
        return "[" + this.f50641b + ", " + g.i(this.f50640a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
