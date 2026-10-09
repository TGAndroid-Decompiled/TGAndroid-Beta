package x7;
public final class f3 implements ia.d {
    public static final f3 f50752a = new Object();
    public static final ia.c f50753b = new ia.c("maxMs", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50754c = new ia.c("minMs", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.n(c0.class, new z(3))));
    public static final ia.c f50755e = new ia.c("firstQuartileMs", hg.c.m(sc.v.n(c0.class, new z(4))));
    public static final ia.c f50756f = new ia.c("medianMs", hg.c.m(sc.v.n(c0.class, new z(5))));
    public static final ia.c f50757g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50753b, a7Var.f50699a);
        eVar.a(f50754c, a7Var.f50700b);
        eVar.a(d, a7Var.f50701c);
        eVar.a(f50755e, a7Var.d);
        eVar.a(f50756f, a7Var.f50702e);
        eVar.a(f50757g, a7Var.f50703f);
    }
}
