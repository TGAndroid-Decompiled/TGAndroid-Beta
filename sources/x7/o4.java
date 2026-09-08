package x7;
public final class o4 implements ia.d {
    public static final o4 f49145a = new Object();
    public static final ia.c f49146b = new ia.c("detectorOptions", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c f49147c = new ia.c("errorCodes", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("totalInitializationMs", i2.g.n(w.f.j(c0.class, new z(3))));
    public static final ia.c f49148e = new ia.c("loggingInitializationMs", i2.g.n(w.f.j(c0.class, new z(4))));
    public static final ia.c f49149f = new ia.c("otherErrors", i2.g.n(w.f.j(c0.class, new z(5))));

    @Override
    public final void a(Object obj, Object obj2) {
        g8 g8Var = (g8) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49146b, g8Var.f49039a);
        eVar.a(f49147c, g8Var.f49040b);
        eVar.a(d, null);
        eVar.a(f49148e, null);
        eVar.a(f49149f, null);
    }
}
