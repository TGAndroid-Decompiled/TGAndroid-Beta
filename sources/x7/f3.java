package x7;
public final class f3 implements ia.d {
    public static final f3 f50750a = new Object();
    public static final ia.c f50751b = new ia.c("maxMs", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50752c = new ia.c("minMs", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.n(c0.class, new z(3))));
    public static final ia.c f50753e = new ia.c("firstQuartileMs", hg.c.m(sc.v.n(c0.class, new z(4))));
    public static final ia.c f50754f = new ia.c("medianMs", hg.c.m(sc.v.n(c0.class, new z(5))));
    public static final ia.c f50755g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50751b, a7Var.f50697a);
        eVar.a(f50752c, a7Var.f50698b);
        eVar.a(d, a7Var.f50699c);
        eVar.a(f50753e, a7Var.d);
        eVar.a(f50754f, a7Var.f50700e);
        eVar.a(f50755g, a7Var.f50701f);
    }
}
