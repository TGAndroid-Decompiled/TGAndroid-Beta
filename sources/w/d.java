package w;

public final class d {

    public final Object f48920a;

    public final String f48921b;

    public d(Object obj, String str) {
        this.f48920a = obj;
        this.f48921b = str;
    }

    public final String a() {
        return "[" + this.f48921b + ", " + g.i(this.f48920a.getClass()) + "]";
    }

    public final String toString() {
        return a();
    }
}
