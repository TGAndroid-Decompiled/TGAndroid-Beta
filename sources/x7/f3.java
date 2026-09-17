package x7;
public final class f3 implements ia.d {
    public static final f3 f49009a = new Object();
    public static final ia.c f49010b = new ia.c("maxMs", i2.g.n(w.f.j(c0.class, new z(1))));
    public static final ia.c f49011c = new ia.c("minMs", i2.g.n(w.f.j(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", i2.g.n(w.f.j(c0.class, new z(3))));
    public static final ia.c f49012e = new ia.c("firstQuartileMs", i2.g.n(w.f.j(c0.class, new z(4))));
    public static final ia.c f49013f = new ia.c("medianMs", i2.g.n(w.f.j(c0.class, new z(5))));
    public static final ia.c f49014g = new ia.c("thirdQuartileMs", i2.g.n(w.f.j(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f49010b, a7Var.f48956a);
        eVar.a(f49011c, a7Var.f48957b);
        eVar.a(d, a7Var.f48958c);
        eVar.a(f49012e, a7Var.d);
        eVar.a(f49013f, a7Var.f48959e);
        eVar.a(f49014g, a7Var.f48960f);
    }
}
