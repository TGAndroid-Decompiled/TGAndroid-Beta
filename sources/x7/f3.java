package x7;
public final class f3 implements ia.d {
    public static final f3 f49476a = new Object();
    public static final ia.c f49477b = new ia.c("maxMs", hg.c.m(sa.e.n(c0.class, new z(1))));
    public static final ia.c f49478c = new ia.c("minMs", hg.c.m(sa.e.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sa.e.n(c0.class, new z(3))));
    public static final ia.c f49479e = new ia.c("firstQuartileMs", hg.c.m(sa.e.n(c0.class, new z(4))));
    public static final ia.c f49480f = new ia.c("medianMs", hg.c.m(sa.e.n(c0.class, new z(5))));
    public static final ia.c f49481g = new ia.c("thirdQuartileMs", hg.c.m(sa.e.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49477b, a7Var.f49423a);
        eVar.a(f49478c, a7Var.f49424b);
        eVar.a(d, a7Var.f49425c);
        eVar.a(f49479e, a7Var.d);
        eVar.a(f49480f, a7Var.f49426e);
        eVar.a(f49481g, a7Var.f49427f);
    }
}
