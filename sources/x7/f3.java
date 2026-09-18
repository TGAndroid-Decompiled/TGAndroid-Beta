package x7;
public final class f3 implements ia.d {
    public static final f3 f45438a = new Object();
    public static final ia.c f45439b = new ia.c("maxMs", hg.k0.o(w.f.j(c0.class, new z(1))));
    public static final ia.c f45440c = new ia.c("minMs", hg.k0.o(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.k0.o(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.k0.o(w.f.j(c0.class, new z(4))));
    public static final ia.c f45441f = new ia.c("medianMs", hg.k0.o(w.f.j(c0.class, new z(5))));
    public static final ia.c f45442g = new ia.c("thirdQuartileMs", hg.k0.o(w.f.j(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45439b, a7Var.f45389a);
        eVar.a(f45440c, a7Var.f45390b);
        eVar.a(d, a7Var.f45391c);
        eVar.a(e, a7Var.d);
        eVar.a(f45441f, a7Var.e);
        eVar.a(f45442g, a7Var.f45392f);
    }
}
