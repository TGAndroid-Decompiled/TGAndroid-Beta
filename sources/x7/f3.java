package x7;
public final class f3 implements ja.d {
    public static final f3 f47980a = new Object();
    public static final ja.c f47981b = new ja.c("maxMs", i2.d.n(t8.b.m(c0.class, new z(1))));
    public static final ja.c f47982c = new ja.c("minMs", i2.d.n(t8.b.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("avgMs", i2.d.n(t8.b.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.d.n(t8.b.m(c0.class, new z(4))));
    public static final ja.c f47983f = new ja.c("medianMs", i2.d.n(t8.b.m(c0.class, new z(5))));
    public static final ja.c f47984g = new ja.c("thirdQuartileMs", i2.d.n(t8.b.m(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f47981b, a7Var.f47931a);
        eVar.d(f47982c, a7Var.f47932b);
        eVar.d(d, a7Var.f47933c);
        eVar.d(e, a7Var.d);
        eVar.d(f47983f, a7Var.e);
        eVar.d(f47984g, a7Var.f47934f);
    }
}
