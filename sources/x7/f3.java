package x7;
public final class f3 implements ia.d {
    public static final f3 f50874a = new Object();
    public static final ia.c f50875b = new ia.c("maxMs", hg.c.m(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50876c = new ia.c("minMs", hg.c.m(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.m(sc.v.n(c0.class, new z(3))));
    public static final ia.c f50877e = new ia.c("firstQuartileMs", hg.c.m(sc.v.n(c0.class, new z(4))));
    public static final ia.c f50878f = new ia.c("medianMs", hg.c.m(sc.v.n(c0.class, new z(5))));
    public static final ia.c f50879g = new ia.c("thirdQuartileMs", hg.c.m(sc.v.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50875b, a7Var.f50821a);
        eVar.a(f50876c, a7Var.f50822b);
        eVar.a(d, a7Var.f50823c);
        eVar.a(f50877e, a7Var.d);
        eVar.a(f50878f, a7Var.f50824e);
        eVar.a(f50879g, a7Var.f50825f);
    }
}
