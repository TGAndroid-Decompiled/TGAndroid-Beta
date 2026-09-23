package x7;
public final class f3 implements ia.d {
    public static final f3 f45360a = new Object();
    public static final ia.c f45361b = new ia.c("maxMs", hg.c.o(w.c.k(c0.class, new z(1))));
    public static final ia.c f45362c = new ia.c("minMs", hg.c.o(w.c.k(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(w.c.k(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hg.c.o(w.c.k(c0.class, new z(4))));
    public static final ia.c f45363f = new ia.c("medianMs", hg.c.o(w.c.k(c0.class, new z(5))));
    public static final ia.c f45364g = new ia.c("thirdQuartileMs", hg.c.o(w.c.k(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f45361b, a7Var.f45311a);
        eVar.a(f45362c, a7Var.f45312b);
        eVar.a(d, a7Var.f45313c);
        eVar.a(e, a7Var.d);
        eVar.a(f45363f, a7Var.e);
        eVar.a(f45364g, a7Var.f45314f);
    }
}
