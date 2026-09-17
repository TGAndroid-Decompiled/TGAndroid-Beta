package t7;
public final class e {
    public final Object f43039a;
    public final Object f43040b;
    public final Object f43041c;

    public e(Object obj, Object obj2, Object obj3) {
        this.f43039a = obj;
        this.f43040b = obj2;
        this.f43041c = obj3;
    }

    public final IllegalArgumentException a() {
        Object obj = this.f43039a;
        return new IllegalArgumentException(a4.a.q(String.valueOf(obj), "=", String.valueOf(this.f43041c), a4.a.w("Multiple entries with same key: ", String.valueOf(obj), "=", String.valueOf(this.f43040b), " and ")));
    }
}
