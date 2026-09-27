package x7;
public final class o4 implements ia.d {
    public static final o4 f45860a = new Object();
    public static final ia.c f45861b = new ia.c("detectorOptions", hg.k0.n(v7.k0.k(c0.class, new z(1))));
    public static final ia.c f45862c = new ia.c("errorCodes", hg.k0.n(v7.k0.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.k0.n(v7.k0.k(c0.class, new z(3))));
    public static final ia.c e = new ia.c("loggingInitializationMs", hg.k0.n(v7.k0.k(c0.class, new z(4))));
    public static final ia.c f45863f = new ia.c("otherErrors", hg.k0.n(v7.k0.k(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45861b, g8Var.f45762a);
        eVar.a(f45862c, g8Var.f45763b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f45863f, null);
    }
}
