package x7;
public final class o4 implements ia.d {
    public static final o4 f44876a = new Object();
    public static final ia.c f44877b = new ia.c("detectorOptions", hc.b.p(w.f.j(c0.class, new z(1))));
    public static final ia.c f44878c = new ia.c("errorCodes", hc.b.p(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hc.b.p(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("loggingInitializationMs", hc.b.p(w.f.j(c0.class, new z(4))));
    public static final ia.c f44879f = new ia.c("otherErrors", hc.b.p(w.f.j(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f44877b, g8Var.f44778a);
        eVar.a(f44878c, g8Var.f44779b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f44879f, null);
    }
}
