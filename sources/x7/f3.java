package x7;
public final class f3 implements ia.d {
    public static final f3 f50989a = new Object();
    public static final ia.c f50990b = new ia.c("maxMs", hg.c.o(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50991c = new ia.c("minMs", hg.c.o(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(sc.v.n(c0.class, new z(3))));
    public static final ia.c f50992e = new ia.c("firstQuartileMs", hg.c.o(sc.v.n(c0.class, new z(4))));
    public static final ia.c f50993f = new ia.c("medianMs", hg.c.o(sc.v.n(c0.class, new z(5))));
    public static final ia.c f50994g = new ia.c("thirdQuartileMs", hg.c.o(sc.v.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50990b, a7Var.f50936a);
        eVar.a(f50991c, a7Var.f50937b);
        eVar.a(d, a7Var.f50938c);
        eVar.a(f50992e, a7Var.d);
        eVar.a(f50993f, a7Var.f50939e);
        eVar.a(f50994g, a7Var.f50940f);
    }
}
