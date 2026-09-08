package x7;
public final class f3 implements ia.d {
    public static final f3 f49008a = new Object();
    public static final ia.c f49009b = new ia.c("maxMs", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c f49010c = new ia.c("minMs", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.j(c0.class, new z(3))));
    public static final ia.c f49011e = new ia.c("firstQuartileMs", i2.g.n(w.f.j(c0.class, new z(4))));
    public static final ia.c f49012f = new ia.c("medianMs", i2.g.n(w.f.j(c0.class, new z(5))));
    public static final ia.c f49013g = new ia.c("thirdQuartileMs", i2.g.n(w.f.j(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49009b, a7Var.f48955a);
        eVar.a(f49010c, a7Var.f48956b);
        eVar.a(d, a7Var.f48957c);
        eVar.a(f49011e, a7Var.d);
        eVar.a(f49012f, a7Var.f48958e);
        eVar.a(f49013g, a7Var.f48959f);
    }
}
