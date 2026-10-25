package u7;
public final class e {
    public final Object f49595a;
    public final Object f49596b;
    public final Object f49597c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f49595a = obj;
        this.f49596b = obj2;
        this.f49597c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f49595a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f49597c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f49596b), " and ")));
    }
}
