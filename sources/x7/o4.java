package x7;
public final class o4 implements ja.d {
    public static final o4 f49502a = new Object();
    public static final ja.c f49503b = new ja.c("detectorOptions", i2.e.o(r4.c.m(c0.class, new z(1))));
    public static final ja.c f49504c = new ja.c("errorCodes", i2.e.o(r4.c.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("totalInitializationMs", i2.e.o(r4.c.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("loggingInitializationMs", i2.e.o(r4.c.m(c0.class, new z(4))));
    public static final ja.c f49505f = new ja.c("otherErrors", i2.e.o(r4.c.m(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f49503b, g8Var.f49404a);
        eVar.d(f49504c, g8Var.f49405b);
        eVar.d(d, null);
        eVar.d(e, null);
        eVar.d(f49505f, null);
    }
}
