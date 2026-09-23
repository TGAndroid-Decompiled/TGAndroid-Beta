package x7;
public final class o4 implements ia.d {
    public static final o4 f45486a = new Object();
    public static final ia.c f45487b = new ia.c("detectorOptions", hg.c.o(w.c.k(c0.class, new z(1))));
    public static final ia.c f45488c = new ia.c("errorCodes", hg.c.o(w.c.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", hg.c.o(w.c.k(c0.class, new z(3))));
    public static final ia.c e = new ia.c("loggingInitializationMs", hg.c.o(w.c.k(c0.class, new z(4))));
    public static final ia.c f45489f = new ia.c("otherErrors", hg.c.o(w.c.k(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45487b, g8Var.f45388a);
        eVar.a(f45488c, g8Var.f45389b);
        eVar.a(d, null);
        eVar.a(e, null);
        eVar.a(f45489f, null);
    }
}
