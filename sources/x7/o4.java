package x7;
public final class o4 implements ja.d {
    public static final o4 f49514a = new Object();
    public static final ja.c f49515b = new ja.c("detectorOptions", i0.a.o(r.c.m(c0.class, new z(1))));
    public static final ja.c f49516c = new ja.c("errorCodes", i0.a.o(r.c.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("totalInitializationMs", i0.a.o(r.c.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("loggingInitializationMs", i0.a.o(r.c.m(c0.class, new z(4))));
    public static final ja.c f49517f = new ja.c("otherErrors", i0.a.o(r.c.m(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49515b, g8Var.f49416a);
        eVar.d(f49516c, g8Var.f49417b);
        eVar.d(d, null);
        eVar.d(e, null);
        eVar.d(f49517f, null);
    }
}
