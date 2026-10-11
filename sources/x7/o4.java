package x7;
public final class o4 implements ia.d {
    public static final o4 f51010a = new Object();
    public static final ia.c f51011b = new ia.c("detectorOptions", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c f51012c = new ia.c("errorCodes", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.c.m(sc.v.n(c0.class, new z(3))));
    public static final ia.c f51013e = new ia.c("loggingInitializationMs", hg.c.m(sc.v.n(c0.class, new z(4))));
    public static final ia.c f51014f = new ia.c("otherErrors", hg.c.m(sc.v.n(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f51011b, g8Var.f50905a);
        eVar.a(f51012c, g8Var.f50906b);
        eVar.a(d, null);
        eVar.a(f51013e, null);
        eVar.a(f51014f, null);
    }
}
