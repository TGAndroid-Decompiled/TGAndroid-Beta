package x7;
public final class f3 implements ja.d {
    public static final f3 f49388a = new Object();
    public static final ja.c f49389b = new ja.c("maxMs", i0.a.o(r.c.m(c0.class, new z(1))));
    public static final ja.c f49390c = new ja.c("minMs", i0.a.o(r.c.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("avgMs", i0.a.o(r.c.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i0.a.o(r.c.m(c0.class, new z(4))));
    public static final ja.c f49391f = new ja.c("medianMs", i0.a.o(r.c.m(c0.class, new z(5))));
    public static final ja.c f49392g = new ja.c("thirdQuartileMs", i0.a.o(r.c.m(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49389b, a7Var.f49339a);
        eVar.d(f49390c, a7Var.f49340b);
        eVar.d(d, a7Var.f49341c);
        eVar.d(e, a7Var.d);
        eVar.d(f49391f, a7Var.e);
        eVar.d(f49392g, a7Var.f49342f);
    }
}
