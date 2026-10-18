package x7;
public final class f3 implements ja.d {
    public static final f3 f49366a = new Object();
    public static final ja.c f49367b = new ja.c("maxMs", i2.d.o(r4.c.m(c0.class, new z(1))));
    public static final ja.c f49368c = new ja.c("minMs", i2.d.o(r4.c.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("avgMs", i2.d.o(r4.c.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("firstQuartileMs", i2.d.o(r4.c.m(c0.class, new z(4))));
    public static final ja.c f49369f = new ja.c("medianMs", i2.d.o(r4.c.m(c0.class, new z(5))));
    public static final ja.c f49370g = new ja.c("thirdQuartileMs", i2.d.o(r4.c.m(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49367b, a7Var.f49317a);
        eVar.d(f49368c, a7Var.f49318b);
        eVar.d(d, a7Var.f49319c);
        eVar.d(e, a7Var.d);
        eVar.d(f49369f, a7Var.e);
        eVar.d(f49370g, a7Var.f49320f);
    }
}
