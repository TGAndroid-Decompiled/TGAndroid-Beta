package x7;
public final class o4 implements ia.d {
    public static final o4 f50888a = new Object();
    public static final ia.c f50889b = new ia.c("detectorOptions", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50890c = new ia.c("errorCodes", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.c.m(sc.v.n(c0.class, new z(3))));
    public static final ia.c f50891e = new ia.c("loggingInitializationMs", hg.c.m(sc.v.n(c0.class, new z(4))));
    public static final ia.c f50892f = new ia.c("otherErrors", hg.c.m(sc.v.n(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50889b, g8Var.f50783a);
        eVar.a(f50890c, g8Var.f50784b);
        eVar.a(d, null);
        eVar.a(f50891e, null);
        eVar.a(f50892f, null);
    }
}
