package x7;
public final class o4 implements ia.d {
    public static final o4 f51125a = new Object();
    public static final ia.c f51126b = new ia.c("detectorOptions", hg.c.o(sc.v.n(c0.class, new z(1))));
    public static final ia.c f51127c = new ia.c("errorCodes", hg.c.o(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.c.o(sc.v.n(c0.class, new z(3))));
    public static final ia.c f51128e = new ia.c("loggingInitializationMs", hg.c.o(sc.v.n(c0.class, new z(4))));
    public static final ia.c f51129f = new ia.c("otherErrors", hg.c.o(sc.v.n(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51126b, g8Var.f51020a);
        eVar.a(f51127c, g8Var.f51021b);
        eVar.a(d, null);
        eVar.a(f51128e, null);
        eVar.a(f51129f, null);
    }
}
