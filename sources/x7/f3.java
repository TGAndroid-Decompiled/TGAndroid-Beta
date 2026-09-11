package x7;
public final class f3 implements ia.d {
    public static final f3 f48979a = new Object();
    public static final ia.c f48980b = new ia.c("maxMs", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c f48981c = new ia.c("minMs", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.j(c0.class, new z(3))));
    public static final ia.c f48982e = new ia.c("firstQuartileMs", i2.g.n(w.f.j(c0.class, new z(4))));
    public static final ia.c f48983f = new ia.c("medianMs", i2.g.n(w.f.j(c0.class, new z(5))));
    public static final ia.c f48984g = new ia.c("thirdQuartileMs", i2.g.n(w.f.j(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f48980b, a7Var.f48926a);
        eVar.a(f48981c, a7Var.f48927b);
        eVar.a(d, a7Var.f48928c);
        eVar.a(f48982e, a7Var.d);
        eVar.a(f48983f, a7Var.f48929e);
        eVar.a(f48984g, a7Var.f48930f);
    }
}
