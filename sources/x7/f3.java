package x7;
public final class f3 implements ia.d {
    public static final f3 f50840a = new Object();
    public static final ia.c f50841b = new ia.c("maxMs", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50842c = new ia.c("minMs", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.n(c0.class, new z(3))));
    public static final ia.c f50843e = new ia.c("firstQuartileMs", hg.c.m(sc.v.n(c0.class, new z(4))));
    public static final ia.c f50844f = new ia.c("medianMs", hg.c.m(sc.v.n(c0.class, new z(5))));
    public static final ia.c f50845g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50841b, a7Var.f50787a);
        eVar.a(f50842c, a7Var.f50788b);
        eVar.a(d, a7Var.f50789c);
        eVar.a(f50843e, a7Var.d);
        eVar.a(f50844f, a7Var.f50790e);
        eVar.a(f50845g, a7Var.f50791f);
    }
}
