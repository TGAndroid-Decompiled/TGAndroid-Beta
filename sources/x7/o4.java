package x7;
public final class o4 implements ia.d {
    public static final o4 f51117a = new Object();
    public static final ia.c f51118b = new ia.c("detectorOptions", hg.c.o(sc.v.n(c0.class, new z(1))));
    public static final ia.c f51119c = new ia.c("errorCodes", hg.c.o(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.c.o(sc.v.n(c0.class, new z(3))));
    public static final ia.c f51120e = new ia.c("loggingInitializationMs", hg.c.o(sc.v.n(c0.class, new z(4))));
    public static final ia.c f51121f = new ia.c("otherErrors", hg.c.o(sc.v.n(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51118b, g8Var.f51012a);
        eVar.a(f51119c, g8Var.f51013b);
        eVar.a(d, null);
        eVar.a(f51120e, null);
        eVar.a(f51121f, null);
    }
}
