package x7;
public final class o4 implements ia.d {
    public static final o4 f49613a = new Object();
    public static final ia.c f49614b = new ia.c("detectorOptions", hg.c.m(sa.e.n(c0.class, new z(1))));
    public static final ia.c f49615c = new ia.c("errorCodes", hg.c.m(sa.e.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.c.m(sa.e.n(c0.class, new z(3))));
    public static final ia.c f49616e = new ia.c("loggingInitializationMs", hg.c.m(sa.e.n(c0.class, new z(4))));
    public static final ia.c f49617f = new ia.c("otherErrors", hg.c.m(sa.e.n(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49614b, g8Var.f49507a);
        eVar.a(f49615c, g8Var.f49508b);
        eVar.a(d, null);
        eVar.a(f49616e, null);
        eVar.a(f49617f, null);
    }
}
