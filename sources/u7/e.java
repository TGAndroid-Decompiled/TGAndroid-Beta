package u7;
public final class e {
    public final Object f49633a;
    public final Object f49634b;
    public final Object f49635c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f49633a = obj;
        this.f49634b = obj2;
        this.f49635c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f49633a;
        return new IllegalArgumentException(a1.g.q(String.valueOf(obj), "=", String.valueOf(this.f49635c), a1.g.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f49634b), " and ")));
    }
}
