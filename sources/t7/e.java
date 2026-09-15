package t7;
public final class e {
    public final Object f43017a;
    public final Object f43018b;
    public final Object f43019c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43017a = obj;
        this.f43018b = obj2;
        this.f43019c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43017a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f43019c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43018b), " and ")));
    }
}
