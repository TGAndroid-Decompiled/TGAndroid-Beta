package w;
public final class d {
    public final Object f59017a;
    public final String f59018b;

    public d(Object obj, String str) {
        this.f59017a = obj;
        this.f59018b = str;
    }

    public final String a() {
        return "[" + this.f59018b + ", " + g.i(this.f59017a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
