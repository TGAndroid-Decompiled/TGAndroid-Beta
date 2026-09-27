package w;
public final class d {
    public final Object f44789a;
    public final String f44790b;

    public d(Object obj, String str) {
        this.f44789a = obj;
        this.f44790b = str;
    }

    public final String a() {
        return "[" + this.f44790b + ", " + g.i(this.f44789a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
