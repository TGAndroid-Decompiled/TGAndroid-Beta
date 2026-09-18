package x7;
public final class o4 implements ia.d {
    public static final o4 f45564a = new Object();
    public static final ia.c f45565b = new ia.c("detectorOptions", hg.k0.o(w.f.j(c0.class, new z(1))));
    public static final ia.c f45566c = new ia.c("errorCodes", hg.k0.o(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.k0.o(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("loggingInitializationMs", hg.k0.o(w.f.j(c0.class, new z(4))));
    public static final ia.c f45567f = new ia.c("otherErrors", hg.k0.o(w.f.j(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45565b, g8Var.f45466a);
        eVar.a(f45566c, g8Var.f45467b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f45567f, null);
    }
}
