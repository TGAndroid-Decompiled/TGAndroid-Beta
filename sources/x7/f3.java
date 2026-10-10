package x7;
public final class f3 implements ia.d {
    public static final f3 f50796a = new Object();
    public static final ia.c f50797b = new ia.c("maxMs", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50798c = new ia.c("minMs", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.n(c0.class, new z(3))));
    public static final ia.c f50799e = new ia.c("firstQuartileMs", hg.c.m(sc.v.n(c0.class, new z(4))));
    public static final ia.c f50800f = new ia.c("medianMs", hg.c.m(sc.v.n(c0.class, new z(5))));
    public static final ia.c f50801g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50797b, a7Var.f50743a);
        eVar.a(f50798c, a7Var.f50744b);
        eVar.a(d, a7Var.f50745c);
        eVar.a(f50799e, a7Var.d);
        eVar.a(f50800f, a7Var.f50746e);
        eVar.a(f50801g, a7Var.f50747f);
    }
}
