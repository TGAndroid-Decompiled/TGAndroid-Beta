package x7;
public final class o4 implements ja.d {
    public static final o4 f48106a = new Object();
    public static final ja.c f48107b = new ja.c("detectorOptions", i2.d.n(t8.b.m(c0.class, new z(1))));
    public static final ja.c f48108c = new ja.c("errorCodes", i2.d.n(t8.b.m(c0.class, new z(2))));
    public static final ja.c d = new ja.c("totalInitializationMs", i2.d.n(t8.b.m(c0.class, new z(3))));
    public static final ja.c e = new ja.c("loggingInitializationMs", i2.d.n(t8.b.m(c0.class, new z(4))));
    public static final ja.c f48109f = new ja.c("otherErrors", i2.d.n(t8.b.m(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ja.e eVar = (ja.e) obj2;
        eVar.d(f48107b, g8Var.f48008a);
        eVar.d(f48108c, g8Var.f48009b);
        eVar.d(d, null);
        eVar.d(e, null);
        eVar.d(f48109f, null);
    }
}
