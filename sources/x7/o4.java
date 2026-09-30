package x7;
public final class o4 implements ia.d {
    public static final o4 f45816a = new Object();
    public static final ia.c f45817b = new ia.c("detectorOptions", hg.c.m(v7.j.l(c0.class, new z(1))));
    public static final ia.c f45818c = new ia.c("errorCodes", hg.c.m(v7.j.l(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.c.m(v7.j.l(c0.class, new z(3))));
    public static final ia.c e = new ia.c("loggingInitializationMs", hg.c.m(v7.j.l(c0.class, new z(4))));
    public static final ia.c f45819f = new ia.c("otherErrors", hg.c.m(v7.j.l(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45817b, g8Var.f45718a);
        eVar.a(f45818c, g8Var.f45719b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f45819f, null);
    }
}
