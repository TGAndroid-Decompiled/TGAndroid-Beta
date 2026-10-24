package x7;
public final class f3 implements ja.d {
    public static final f3 f49817a = new Object();
    public static final ja.c f49818b = new ja.c("maxMs", i2.o1.p(si.o0.m(c0.class, new z(1))));
    public static final ja.c f49819c = new ja.c("minMs", i2.o1.p(si.o0.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("avgMs", i2.o1.p(si.o0.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.o1.p(si.o0.m(c0.class, new z(4))));
    public static final ja.c f49820f = new ja.c("medianMs", i2.o1.p(si.o0.m(c0.class, new z(5))));
    public static final ja.c f49821g = new ja.c("thirdQuartileMs", i2.o1.p(si.o0.m(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49818b, a7Var.f49768a);
        eVar.d(f49819c, a7Var.f49769b);
        eVar.d(d, a7Var.f49770c);
        eVar.d(e, a7Var.d);
        eVar.d(f49820f, a7Var.e);
        eVar.d(f49821g, a7Var.f49771f);
    }
}
