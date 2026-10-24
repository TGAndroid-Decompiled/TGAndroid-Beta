package x7;
public final class o4 implements ja.d {
    public static final o4 f49943a = new Object();
    public static final ja.c f49944b = new ja.c("detectorOptions", i2.o1.p(si.o0.m(c0.class, new z(1))));
    public static final ja.c f49945c = new ja.c("errorCodes", i2.o1.p(si.o0.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("totalInitializationMs", i2.o1.p(si.o0.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("loggingInitializationMs", i2.o1.p(si.o0.m(c0.class, new z(4))));
    public static final ja.c f49946f = new ja.c("otherErrors", i2.o1.p(si.o0.m(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49944b, g8Var.f49845a);
        eVar.d(f49945c, g8Var.f49846b);
        eVar.d(d, null);
        eVar.d(e, null);
        eVar.d(f49946f, null);
    }
}
