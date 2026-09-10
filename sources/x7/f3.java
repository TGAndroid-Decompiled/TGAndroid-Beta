package x7;
public final class f3 implements ia.d {
    public static final f3 f44750a = new Object();
    public static final ia.c f44751b = new ia.c("maxMs", hc.b.p(w.f.j(c0.class, new z(1))));
    public static final ia.c f44752c = new ia.c("minMs", hc.b.p(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hc.b.p(w.f.j(c0.class, new z(3))));
    public static final ia.c e = new ia.c("firstQuartileMs", hc.b.p(w.f.j(c0.class, new z(4))));
    public static final ia.c f44753f = new ia.c("medianMs", hc.b.p(w.f.j(c0.class, new z(5))));
    public static final ia.c f44754g = new ia.c("thirdQuartileMs", hc.b.p(w.f.j(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f44751b, a7Var.f44701a);
        eVar.a(f44752c, a7Var.f44702b);
        eVar.a(d, a7Var.f44703c);
        eVar.a(e, a7Var.d);
        eVar.a(f44753f, a7Var.e);
        eVar.a(f44754g, a7Var.f44704f);
    }
}
