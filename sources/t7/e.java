package t7;
public final class e {
    public final Object f43306a;
    public final Object f43307b;
    public final Object f43308c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43306a = obj;
        this.f43307b = obj2;
        this.f43308c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43306a;
        return new IllegalArgumentException(a4.a.r(String.valueOf(obj), "=", String.valueOf(this.f43308c), a4.a.x("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43307b), " and ")));
    }
}
