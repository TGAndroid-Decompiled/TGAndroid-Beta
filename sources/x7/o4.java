package x7;
public final class o4 implements ia.d {
    public static final o4 f49606a = new Object();
    public static final ia.c f49607b = new ia.c("detectorOptions", hg.c.m(sa.e.n(c0.class, new z(1))));
    public static final ia.c f49608c = new ia.c("errorCodes", hg.c.m(sa.e.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.c.m(sa.e.n(c0.class, new z(3))));
    public static final ia.c f49609e = new ia.c("loggingInitializationMs", hg.c.m(sa.e.n(c0.class, new z(4))));
    public static final ia.c f49610f = new ia.c("otherErrors", hg.c.m(sa.e.n(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49607b, g8Var.f49500a);
        eVar.a(f49608c, g8Var.f49501b);
        eVar.a(d, null);
        eVar.a(f49609e, null);
        eVar.a(f49610f, null);
    }
}
