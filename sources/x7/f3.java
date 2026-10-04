package x7;
public final class f3 implements ia.d {
    public static final f3 f49461a = new Object();
    public static final ia.c f49462b = new ia.c("maxMs", hg.k0.m(t8.b.n(c0.class, new z(1))));
    public static final ia.c f49463c = new ia.c("minMs", hg.k0.m(t8.b.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.m(t8.b.n(c0.class, new z(3))));
    public static final ia.c f49464e = new ia.c("firstQuartileMs", hg.k0.m(t8.b.n(c0.class, new z(4))));
    public static final ia.c f49465f = new ia.c("medianMs", hg.k0.m(t8.b.n(c0.class, new z(5))));
    public static final ia.c f49466g = new ia.c("thirdQuartileMs", hg.k0.m(t8.b.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49462b, a7Var.f49408a);
        eVar.a(f49463c, a7Var.f49409b);
        eVar.a(d, a7Var.f49410c);
        eVar.a(f49464e, a7Var.d);
        eVar.a(f49465f, a7Var.f49411e);
        eVar.a(f49466g, a7Var.f49412f);
    }
}
