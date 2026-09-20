package x7;
public final class f3 implements ia.d {
    public static final f3 f45706a = new Object();
    public static final ia.c f45707b = new ia.c("maxMs", hg.k0.n(v7.j0.k(c0.class, new z(1))));
    public static final ia.c f45708c = new ia.c("minMs", hg.k0.n(v7.j0.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.n(v7.j0.k(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.n(v7.j0.k(c0.class, new z(4))));
    public static final ia.c f45709f = new ia.c("medianMs", hg.k0.n(v7.j0.k(c0.class, new z(5))));
    public static final ia.c f45710g = new ia.c("thirdQuartileMs", hg.k0.n(v7.j0.k(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45707b, a7Var.f45657a);
        eVar.a(f45708c, a7Var.f45658b);
        eVar.a(d, a7Var.f45659c);
        eVar.a(e, a7Var.d);
        eVar.a(f45709f, a7Var.e);
        eVar.a(f45710g, a7Var.f45660f);
    }
}
