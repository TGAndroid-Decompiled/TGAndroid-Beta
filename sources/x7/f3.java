package x7;
public final class f3 implements ia.d {
    public static final f3 f45406a = new Object();
    public static final ia.c f45407b = new ia.c("maxMs", hg.c.o(w.c.k(c0.class, new z(1))));
    public static final ia.c f45408c = new ia.c("minMs", hg.c.o(w.c.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(w.c.k(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.o(w.c.k(c0.class, new z(4))));
    public static final ia.c f45409f = new ia.c("medianMs", hg.c.o(w.c.k(c0.class, new z(5))));
    public static final ia.c f45410g = new ia.c("thirdQuartileMs", hg.c.o(w.c.k(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45407b, a7Var.f45357a);
        eVar.a(f45408c, a7Var.f45358b);
        eVar.a(d, a7Var.f45359c);
        eVar.a(e, a7Var.d);
        eVar.a(f45409f, a7Var.e);
        eVar.a(f45410g, a7Var.f45360f);
    }
}
