package x7;
public final class f3 implements ia.d {
    public static final f3 f49460a = new Object();
    public static final ia.c f49461b = new ia.c("maxMs", hg.k0.m(t8.b.n(c0.class, new z(1))));
    public static final ia.c f49462c = new ia.c("minMs", hg.k0.m(t8.b.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.m(t8.b.n(c0.class, new z(3))));
    public static final ia.c f49463e = new ia.c("firstQuartileMs", hg.k0.m(t8.b.n(c0.class, new z(4))));
    public static final ia.c f49464f = new ia.c("medianMs", hg.k0.m(t8.b.n(c0.class, new z(5))));
    public static final ia.c f49465g = new ia.c("thirdQuartileMs", hg.k0.m(t8.b.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49461b, a7Var.f49407a);
        eVar.a(f49462c, a7Var.f49408b);
        eVar.a(d, a7Var.f49409c);
        eVar.a(f49463e, a7Var.d);
        eVar.a(f49464f, a7Var.f49410e);
        eVar.a(f49465g, a7Var.f49411f);
    }
}
