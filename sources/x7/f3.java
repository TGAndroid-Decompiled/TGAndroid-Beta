package x7;
public final class f3 implements ia.d {
    public static final f3 f45734a = new Object();
    public static final ia.c f45735b = new ia.c("maxMs", hg.k0.n(v7.k0.k(c0.class, new z(1))));
    public static final ia.c f45736c = new ia.c("minMs", hg.k0.n(v7.k0.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.n(v7.k0.k(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.n(v7.k0.k(c0.class, new z(4))));
    public static final ia.c f45737f = new ia.c("medianMs", hg.k0.n(v7.k0.k(c0.class, new z(5))));
    public static final ia.c f45738g = new ia.c("thirdQuartileMs", hg.k0.n(v7.k0.k(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45735b, a7Var.f45685a);
        eVar.a(f45736c, a7Var.f45686b);
        eVar.a(d, a7Var.f45687c);
        eVar.a(e, a7Var.d);
        eVar.a(f45737f, a7Var.e);
        eVar.a(f45738g, a7Var.f45688f);
    }
}
