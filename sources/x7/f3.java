package x7;
public final class f3 implements ia.d {
    public static final f3 f49469a = new Object();
    public static final ia.c f49470b = new ia.c("maxMs", hg.c.m(sa.e.n(c0.class, new z(1))));
    public static final ia.c f49471c = new ia.c("minMs", hg.c.m(sa.e.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sa.e.n(c0.class, new z(3))));
    public static final ia.c f49472e = new ia.c("firstQuartileMs", hg.c.m(sa.e.n(c0.class, new z(4))));
    public static final ia.c f49473f = new ia.c("medianMs", hg.c.m(sa.e.n(c0.class, new z(5))));
    public static final ia.c f49474g = new ia.c("thirdQuartileMs", hg.c.m(sa.e.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49470b, a7Var.f49416a);
        eVar.a(f49471c, a7Var.f49417b);
        eVar.a(d, a7Var.f49418c);
        eVar.a(f49472e, a7Var.d);
        eVar.a(f49473f, a7Var.f49419e);
        eVar.a(f49474g, a7Var.f49420f);
    }
}
