package x7;
public final class f3 implements ia.d {
    public static final f3 f50981a = new Object();
    public static final ia.c f50982b = new ia.c("maxMs", hg.c.o(sc.v.n(c0.class, new z(1))));
    public static final ia.c f50983c = new ia.c("minMs", hg.c.o(sc.v.n(c0.class, new z(2))));
    public static final ia.c d = new ia.c("avgMs", hg.c.o(sc.v.n(c0.class, new z(3))));
    public static final ia.c f50984e = new ia.c("firstQuartileMs", hg.c.o(sc.v.n(c0.class, new z(4))));
    public static final ia.c f50985f = new ia.c("medianMs", hg.c.o(sc.v.n(c0.class, new z(5))));
    public static final ia.c f50986g = new ia.c("thirdQuartileMs", hg.c.o(sc.v.n(c0.class, new z(6))));

    @Override
    public final void a(Object obj, Object obj2) {
        a7 a7Var = (a7) obj;
        ia.e eVar = (ia.e) obj2;
        eVar.a(f50982b, a7Var.f50928a);
        eVar.a(f50983c, a7Var.f50929b);
        eVar.a(d, a7Var.f50930c);
        eVar.a(f50984e, a7Var.d);
        eVar.a(f50985f, a7Var.f50931e);
        eVar.a(f50986g, a7Var.f50932f);
    }
}
